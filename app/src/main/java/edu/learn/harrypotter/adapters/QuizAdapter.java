package edu.learn.harrypotter.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import edu.learn.harrypotter.datas.HarryPotterQuiz;
import edu.learn.harrypotterapp.R;


public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {

    private final List<HarryPotterQuiz> quizList;
    private final Context context;

    public QuizAdapter(Context context, List<HarryPotterQuiz> quizList) {
        this.context = context;
        this.quizList = quizList;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_quiz, parent, false);
        return new QuizViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        HarryPotterQuiz quiz = quizList.get(position);

        int questionNumber = position + 1;
        holder.questionText.setText(questionNumber+". "+ quiz.getQuestion());

        List<String> choices = quiz.getChoices();
        holder.option1.setText(choices.get(0));
        holder.option2.setText(choices.get(1));
        holder.option3.setText(choices.get(2));
        holder.option4.setText(choices.get(3));



        holder.option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleAnswer(holder,0,quiz.getCorrectAnswer(), choices);
            }
        });

        holder.option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAnswer(holder,1,quiz.getCorrectAnswer(),choices);
            }
        });


        holder.option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAnswer(holder,2,quiz.getCorrectAnswer(),choices);
            }
        });


        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAnswer(holder,3,quiz.getCorrectAnswer(),choices);
            }
        });


    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }



    private void handleAnswer(QuizViewHolder holder, int selectedIndex, int correctAnswerPosition, List<String> choice) {
        if (selectedIndex == correctAnswerPosition) {
            holder.feedbackText.setText("Correct");
            holder.feedbackText.setTextColor(Color.GREEN);
        } else {
            holder.feedbackText.setText("Wrong. Correct answer is: " + choice.get(correctAnswerPosition));
            holder.feedbackText.setTextColor(Color.RED);
        }
        holder.feedbackText.setVisibility(View.VISIBLE);
    }

    public static class QuizViewHolder extends RecyclerView.ViewHolder {
        TextView questionText;
        RadioGroup radioGroup;
        RadioButton option1;
        RadioButton option2;
        RadioButton option3;
        RadioButton option4;
        TextView feedbackText;

        public QuizViewHolder(@NonNull View itemView) {
            super(itemView);
            questionText = itemView.findViewById(R.id.question_text);
            radioGroup = itemView.findViewById(R.id.radio_group);
            option1 = itemView.findViewById(R.id.option1);
            option2 = itemView.findViewById(R.id.option2);
            option3 = itemView.findViewById(R.id.option3);
            option4 = itemView.findViewById(R.id.option4);
            feedbackText = itemView.findViewById(R.id.feedback_text);
        }
    }
}
