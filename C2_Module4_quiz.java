import java.util.Scanner;

public class C2_Module4_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 2- Conditionals,Loops and functions.");
        System.out.println("Question 1- A private method can be overridden. True or False?");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("false")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- False.");
        }
        System.out.println("Next, Question 2- While overloading a method, should a parameter list be same or different?");
        String answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("different")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- different.");
        }
        System.out.println("Next, Question 3- Static Polymorphism or Compile time Polymorphism used overriding or overloading?");
        String answer3 = input.nextLine();
        if (answer3.equalsIgnoreCase("overloading")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- overloading.");
        }
        System.out.println("Next, Question 4- What errors are not detected during compilation?");
        String answer4 = input.nextLine();
        if (answer4.equalsIgnoreCase("runtime")||answer4.equalsIgnoreCase("run-time")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- runtime.");
        }
        System.out.println("Next, Question 5- Even when a method is declared as final, it can be overridden. True or false?");
        String answer5 = input.nextLine();
        if (answer5.equalsIgnoreCase("false")) {
            System.out.println("Correct Answer!");
            score+=1;
        } else {
            System.out.println("Wrong Answer! The correct answer is- false.");
        }
        System.out.println("Your final score is " +score);
        input.close();
    }
}
