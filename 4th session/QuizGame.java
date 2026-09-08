import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int questionNum = 1;
        int attempted = 0;

        final int TOTAL_QUESTIONS = 5;

        while (questionNum <= TOTAL_QUESTIONS) {

            System.out.println("\nQuestion " + questionNum);

            if (questionNum == 1) {
                System.out.println("What is the capital of India?");
                System.out.println("A. Mumbai");
                System.out.println("B. Delhi");
                System.out.println("C. Pune");
                System.out.println("D. Chennai");

                System.out.print("Enter answer (A/B/C/D) or Q to quit: ");
                char answer = sc.next().toUpperCase().charAt(0);

                if (answer == 'Q') {
                    break;
                }

                attempted++;

                if (answer == 'B') {
                    score += 10;
                }

            } else if (questionNum == 2) {

                System.out.println("Which language is used for Android development?");
                System.out.println("A. Java");
                System.out.println("B. HTML");
                System.out.println("C. CSS");
                System.out.println("D. SQL");

                System.out.print("Enter answer (A/B/C/D) or Q to quit: ");
                char answer = sc.next().toUpperCase().charAt(0);

                if (answer == 'Q') {
                    break;
                }

                attempted++;

                if (answer == 'A') {
                    score += 10;
                }

            } else if (questionNum == 3) {

                System.out.println("Which of these is a programming language?");
                System.out.println("A. Python");
                System.out.println("B. Chrome");
                System.out.println("C. Windows");
                System.out.println("D. Google");

                System.out.print("Enter answer (A/B/C/D) or Q to quit: ");
                char answer = sc.next().toUpperCase().charAt(0);

                if (answer == 'Q') {
                    break;
                }

                attempted++;

                if (answer == 'A') {
                    score += 10;
                }

            } else if (questionNum == 4) {

                System.out.println("What does CPU stand for?");
                System.out.println("A. Central Processing Unit");
                System.out.println("B. Computer Personal Unit");
                System.out.println("C. Central Program Unit");
                System.out.println("D. Control Processing Unit");

                System.out.print("Enter answer (A/B/C/D) or Q to quit: ");
                char answer = sc.next().toUpperCase().charAt(0);

                if (answer == 'Q') {
                    break;
                }

                attempted++;

                if (answer == 'A') {
                    score += 10;
                }

            } else {

                System.out.println("Which data structure follows LIFO?");
                System.out.println("A. Queue");
                System.out.println("B. Array");
                System.out.println("C. Stack");
                System.out.println("D. Linked List");

                System.out.print("Enter answer (A/B/C/D) or Q to quit: ");
                char answer = sc.next().toUpperCase().charAt(0);

                if (answer == 'Q') {
                    break;
                }

                attempted++;

                if (answer == 'C') {
                    score += 10;
                }
            }

            questionNum++;
        }

        double percentage = (score / 50.0) * 100;

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Questions Attempted: " + attempted);
        System.out.println("Score: " + score + "/50");
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}