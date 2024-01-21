import java.util.HashMap;
import java.util.Scanner;
public class C4_Module6_GraphsAndGraphAlgorithms {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'a');
        hm.put(2,'b');
        hm.put(3,'b');
        hm.put(4,'a');
        hm.put(5,'b');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 4- Binary Trees And Binary Search Trees. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- What sort of relationship between nodes is shown in a directed graph?\na)Asymmetric b)Symmetric");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! An Asymmetric relationship between nodes is shown in a directed graph .");
        }
        System.out.println("Question 2- Graphs with a minimum or a small number of edges connecting the nodes are called?\na)Dense graph b)Sparse graph");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! It is Sparse graph.");
        }
        System.out.println("Question 3- If there is an isolated node, which of the following graph implementations fail?\na)Adjacency Matrix b)Edge List");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! An edge list would fail in this scenario.");
        }
        System.out.println("Question 4- An adjacency matrix could be represented using which the following?-\na)A 2D matrix of boolean values b)A 2D matrix of the connecting vertices");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! An adjacency matrix can be represented using a 2D matrix of boolean values.");
        }
        System.out.println("Question 5- Getting all the nodes is slower in which graph representation?-\na)Adjacency List b)Adjacency Matrix");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Adjacency Matrix is slower.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
}
}

