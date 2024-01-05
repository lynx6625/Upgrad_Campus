import java.util.Scanner;
public class Module1_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 1- Variables and data types.");
        System.out.println("Question 1- What is the name of the class which needs to be imported in order to take user input?");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("scanner")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- Scanner.");
        }
        System.out.println("Next, Question 2- What is the name of the operator which will give us the remainder?");
        String answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("modulus") || answer2.equalsIgnoreCase("mod")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- Modulus.");
        }
        System.out.println("Next, Question 3- What is the name of the logical operator which is denoted by ||?");
        String answer3 = input.nextLine();
        if (answer3.equalsIgnoreCase("or")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- OR.");
        }
        System.out.println("Next, Question 4- What operator will be evaluate first, AND or NOT?");
        String answer4 = input.nextLine();
        if (answer4.equalsIgnoreCase("not")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- NOT.");
        }
        System.out.println("Next, Question 5- What is the symbol used to start a single line comment?");
        String answer5 = input.nextLine();
        if (answer5.equalsIgnoreCase("//")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- //.");
        }
        System.out.println("Your final score is " +score);


    }
}