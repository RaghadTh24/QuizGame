/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgame;

/**
 *
 * @author Raghad
 */
import java.util.Scanner;

public class QuizGame {
    private static final String[] questions = {
        "What is the capital of Saudi Arabia?",
        "Who is the smartest animal?",
        "What is the chemical symbol for water?"
    };
    private static final String[][] options = {
        {"a) Riyadh", "b) Mecca", "c) Jeddah", "d) Medina"},
        {"a) Dolphin", "b) Chimpanzee", "c) Elephant", "d) Octopus"},
        {"a) H2O", "b) HO", "c) OH", "d) H2SO4"}
    };
    private static final char[] answers = {'a', 'b', 'a'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAnswer = scanner.nextLine().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nQuiz complete!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        scanner.close();
    }
}

