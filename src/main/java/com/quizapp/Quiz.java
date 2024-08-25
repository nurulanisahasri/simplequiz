package com.quizapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addquestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : question) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i+1) + "." + options[i]);
            }

            System.out.println("Your answer (1-" + options.length + "): ");

            int answer = scanner.nextInt();
            if (question.isCorrectAnswer(answer-1)) {
                score++;
            }
        }
        scanner.close();
    }

    public void showScore() {
        System.out.println("You scored: " + score + " out of " + question.size());
    }
}