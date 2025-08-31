package net.pathbatch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! This is a simple trivia game!");
        int score = 0;
        System.out.println("What is the name of the creator of this game?");
        String answer = scanner.next();
        if (answer.equals("PathBatch")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Not correct! It was PathBatch");
        }
        System.out.println("Next Question: What game are we trying to mod?");
        answer = scanner.next();
        if (answer.equals("Minecraft")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Not correct! It was Minecraft!");
        }
        System.out.println("Next Question: What kind of mod do I want to make?");
        answer = scanner.next();
        if (answer.equals("Magic")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Not correct! It was Magic!");
        }
        switch(score) {
            case 3:
                System.out.println("All answers correct! Good job!"); break;
            case 2:
                System.out.println("2/3 Not bad!"); break;
            case 1:
                System.out.println("1/3 Nice try!"); break;
            default:
                System.out.println("0/3 Better luck next time!");
        }
    }
}