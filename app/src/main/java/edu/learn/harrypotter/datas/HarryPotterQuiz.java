package edu.learn.harrypotter.datas;

import java.util.List;

public class HarryPotterQuiz {

    private int id;
    private String question;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getSelectedChoice() {
        return selectedChoice;
    }

    public void setSelectedChoice(int selectedChoice) {
        this.selectedChoice = selectedChoice;
    }

    private List<String> choices;
    private int correctAnswer;
    private int selectedChoice;


    public HarryPotterQuiz(int id, String question, List<String> choices, int correctAnswer) {
        this.id = id;
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
        this.selectedChoice = -1;
    }








}
