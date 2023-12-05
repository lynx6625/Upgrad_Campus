import java.util.Scanner;
public class Module2_search_and_sort_quiz {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire for module 2- Searching and Sorting. This is a multiple choice quiz, so please enter input as a or b.");
        System.out.println("Question 1- How type of search algorithm requires a sorted array?\na)Linear Search  b)Binary Search");
        int score =0;
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        switch (answer1) {
            case "a","A":
        System.out.println("Wrong answer. The correct answer is - Binary Search.");
            break;
            case "b","B":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 2- What is the worst case in a Linear Search?\na)Element being searched is in the middle  b)Element being searched is the last element");
        String answer2 = input.nextLine();
        switch (answer2) {
            case "a","A":
        System.out.println("Wrong answer. The correct answer is- Element being searched is the last element.");
            break;
            case "b","B":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 3- What is the time complexity of Binary search?\na)O(logn)  b)O(n)");
        String answer3 = input.nextLine();
        switch (answer3) {
            case "a","A":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b","B":
        System.out.println("Wrong answer. The correct answer is O(logn).");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 4- What sorting algorithm has worse time complexity in best-case scenario?\na)Selection Sort  b)Insertion Sort");
        String answer4 = input.nextLine();
        switch (answer4) {
            case "a","A":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b","B":
        System.out.println("Wrong answer. The correct answer is - Selction sort.");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

        System.out.println("Question 5- What sorting algorithm is known as a stable sort?\na)Merge Sort   b)Quick sort");
        String answer5 = input.nextLine();
        switch (answer5) {
            case "a","A":
        System.out.println("Correct Answer!");
        score +=1;
            break;
            case "b","B":
        System.out.println("Wrong answer. The correct answer is -Merge Sort.");
            break;
            default:
        System.out.println("Please choose between a and b.");
        }

    
        
        System.out.println("Your final score is " +score + " out of 5 questions.");


    }
}