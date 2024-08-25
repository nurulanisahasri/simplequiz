package com.quizapp;

public class Question {
    private String questionText;
    private Sting[] options;
    private int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionTect() {
        return questionText;
    }

    public String[] options() {
        return options;
    }

    public boolean isCorrectAnswe(int answerIndex) {
        return answerIndex = correctAnswerIndex;
    }
}

