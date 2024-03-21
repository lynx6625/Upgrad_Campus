import java.util.HashMap;
import java.util.Scanner;
public class C4_Module4_BinaryTreesAndBinarySearchTrees {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'b');
        hm.put(2,'a');
        hm.put(3,'b');
        hm.put(4,'a');
        hm.put(5,'a');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 4- Binary Trees And Binary Search Trees. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- A non-linear data structure has how many levels?\na)Single Level b)Multiple levels");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A non-linear data structure has Multiple levels.");
        }
        System.out.println("Question 2- The maximum number of nodes in a binary tree of height h is?\na)2^h-1 b)2^h+1");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! It is 2^h-1 .");
        }
        System.out.println("Question 3- A full binary tree with all lead nodes at the same level is?\na)Complete Binary Tree b)Perfect Binary Tree");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! It is a Perfect Binary tree.");
        }
        System.out.println("Question 4- A binary search tree is also called?-\na)Ordered binary tree b)Unordered binary tree");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A binary search tree is also called Ordered binary tree.");
        }
        System.out.println("Question 5- A pre-processed binary search tree made from values in increasing and decreasing order has a time complexity of ?-\na)O(n) b)O(log n)");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Time complexity is O(n).");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}