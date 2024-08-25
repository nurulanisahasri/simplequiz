package com.quizapp;

public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Question q1 = new Question("What is the capital of France?", 
                                   new String[]{"Berlin", "Madrid", "Paris", "Lisbon"}, 2);
        Question q2 = new Question("Which language is used in Android development?", 
                                   new String[]{"Python", "Java", "C#", "Swift"}, 1);
        Question q3 = new Question("Which company created Java?", 
                                   new String[]{"Google", "Apple", "Sun Microsystems", "Microsoft"}, 2);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

        quiz.start();
        quiz.showScore();
    }
}