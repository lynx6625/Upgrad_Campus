import java.util.Scanner;
public class Module1_AlgoAnalysis_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 1- Algorithm Analysis.");
        System.out.println("Question 1- How would the given time complexity function be reduced?\nT(n) = 6n^3+2n^2+4\na)n^2  b)n^3");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        switch (answer1.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is n^3.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 2- If two loops are nested, which rule do we follow?\na)Rule of Sums  b)Rule of Products");
        String answer2 = input.nextLine();
        switch (answer2.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is Rule of Products.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 3- What among the two given Big O functions is more efficient?\na)O(logn)  b)O(nlogn)");
        String answer3 = input.nextLine();
        switch (answer3.toLowerCase()) {
            case "a":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b":
        System.out.println("Wrong answer. The correct answer is O(logn).");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 4- What among the two given Big O functions is less efficient?\na)O(n!)  b)O(2^n)");
        String answer4 = input.nextLine();
        switch (answer4.toLowerCase()) {
            case "a":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b":
        System.out.println("Wrong answer. The correct answer is O(n!).");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 5- What would be the time complexity for a function that returns fibonacci series of a given integer, using recursion?\na)O(2^n)   b)O(n)");
        String answer5 = input.nextLine();
        switch (answer5.toLowerCase()) {
            case "a":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b":
        System.out.println("Wrong answer. The correct answer is O(2^n).");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

    
        
        System.out.println("Your final score is " +score + " out of 5a questions. ");


    }
}