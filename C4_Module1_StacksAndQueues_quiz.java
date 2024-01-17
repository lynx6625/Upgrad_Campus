import java.util.Scanner;
public class C4_Module1_StacksAndQueues_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 1- Stacks and queues.");
        System.out.println("Question 1- An ArrayList is better for which of the following, when compared to a linked list?\na)Data manipulation b)Storing and accessing data");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        switch (answer1.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is Storage and accessing the data.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 2- What is the exception when you try to push into a stack which is already at max capacity?\na)Stack Underflow  b)Stack Overflow");
        String answer2 = input.nextLine();
        switch (answer2.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is Stack Overflow.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 3- What is the time complexity of making push and pop operation costly respectively, when a stack is implemented using two queues?\na)O(1) for Push and O(n) for Pop  b)O(n) for both");
        String answer3 = input.nextLine();
        switch (answer3.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is O(n) for both.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 4- What data structure is preffered if a String has to be reversed?\na)Stack  b)Queue");
        String answer4 = input.nextLine();
        switch (answer4.toLowerCase()) {
            case "a":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b":
        System.out.println("Wrong answer. The correct answer is Stack.");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 5- Undo/Redo operation in Word or Excel is a real life application of which data structure ?\na)Queue   b)Stack");
        String answer5 = input.nextLine();
        switch (answer5.toLowerCase()) {
            case "a":
        System.out.println("Wrong answer. The correct answer is Stack.");
            break;
            case "b":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

     
        System.out.println("Your final score is " +score + " out of 5 questions. ");


    }
}