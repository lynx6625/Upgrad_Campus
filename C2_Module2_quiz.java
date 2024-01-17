import java.util.Scanner;
    public class C2_Module2_quiz {
        public static void main(String[] args) {
            System.out.println("Welcome to the questionnaire for module 2- Conditionals,Loops and functions.");
            System.out.println("Question 1- What is the name of the statement used between cases in a switch statement so that other statements are not executed?");
            int score =0;
            Scanner input = new Scanner(System.in);
            String answer1 = input.nextLine();
            if (answer1.equalsIgnoreCase("break")) {
                System.out.println("Correct Answer!");
                score+=1;
            } else {
                System.out.println("Wrong Answer! The correct answer is- Break.");
            }
            System.out.println("Next, Question 2- What is the name of the loop used to execute statements endlessly until the condition is met?");
            String answer2 = input.nextLine();
            if (answer2.equalsIgnoreCase("while")) {
                System.out.println("Correct Answer!");
                score+=1;
            } else {
                System.out.println("Wrong Answer! The correct answer is- While.");
            }
            System.out.println("Next, Question 3- What is the name of the statement used to skip an iteration in a loop without exiting it?");
            String answer3 = input.nextLine();
            if (answer3.equalsIgnoreCase("continue")) {
                System.out.println("Correct Answer!");
                score+=1;
            } else {
                System.out.println("Wrong Answer! The correct answer is- Continue.");
            }
            System.out.println("Next, Question 4- What are the values passed into a function called?");
            String answer4 = input.nextLine();
            if (answer4.equalsIgnoreCase("arguments")) {
                System.out.println("Correct Answer!");
                score+=1;
            } else {
                System.out.println("Wrong Answer! The correct answer is- Arguments.");
            }
            System.out.println("Next, Question 5- What is the name of the library can we import to give us access to inbuilt functions to perform basic numeric operations?");
            String answer5 = input.nextLine();
            if (answer5.equalsIgnoreCase("math")) {
                System.out.println("Correct Answer!");
                score+=1;
            } else {
                System.out.println("Wrong Answer! The correct answer is- Math.");
            }
            System.out.println("Your final score is " +score);


        }
    }

