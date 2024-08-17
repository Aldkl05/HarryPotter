package edu.learn.harrypotter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.learn.harrypotter.adapters.QuizAdapter;
import edu.learn.harrypotter.datas.HarryPotterQuestionBank;
import edu.learn.harrypotter.datas.HarryPotterQuiz;
import edu.learn.harrypotterapp.R;

public class QuizActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private QuizAdapter quizAdapter;
    private ArrayList<HarryPotterQuiz> questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

        recyclerView = findViewById(R.id.Quizrecycler_view);

        HarryPotterQuestionBank questionBank = new HarryPotterQuestionBank();
        ArrayList<HarryPotterQuiz> questions =
                questionBank.getQuestions(questionBank.getQuestionsNumber(15));



        // write an algorthim to generte random harrypotter question
        // with given paramenter of total questions in
        // HarryPotterQuestionBank class

        // HarryPotterQuestionBank harryPotterQuiz = new HarryPotterQuestionBank();
        //
        //        questions =  get your questions from questionbanks.

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        quizAdapter = new QuizAdapter(this, questions);
        recyclerView.setAdapter(quizAdapter);
    }
}