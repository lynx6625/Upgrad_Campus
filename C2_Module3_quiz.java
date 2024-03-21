import java.util.Scanner;
public class C2_Module3_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 2- Conditionals,Loops and functions.");
        System.out.println("Question 1- What is the keyword used to differentiate between instance variables and parameters in a constructor ?");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("this")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- this.");
        }
        System.out.println("Next, Question 2- What is the name of the method used to access private variables from outside the class they are declared in?");
        String answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("getter")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- getter.");
        }
        System.out.println("Next, Question 3- A subclass can inherit features from a superclass using what keyword?");
        String answer3 = input.nextLine();
        if (answer3.equalsIgnoreCase("extends")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- extends.");
        }
        System.out.println("Next, Question 4- What access modifier can be accessed in the same class but not in a different package?");
        String answer4 = input.nextLine();
        if (answer4.equalsIgnoreCase("default")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- default.");
        }
        System.out.println("Next, Question 5- What keyword is used to prevent overriding variable and methods in the program?");
        String answer5 = input.nextLine();
        if (answer5.equalsIgnoreCase("final")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- final.");
        }
        System.out.println("Your final score is " +score);
        input.close();

    }
}
