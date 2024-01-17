import java.util.HashMap;
import java.util.Scanner;
public class C4_Module2_HashtablesHashmapsAndHashsets {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'a');
        hm.put(2,'b');
        hm.put(3,'b');
        hm.put(4,'b');
        hm.put(5,'a');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 2- Hashtables, Hashmaps and Hashsets. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- What is the phenomenon called when two keys in a hashtable get hashed to the same index?\na)Collision b)Chaining");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! The phenomenon is called collision.");
        }
        System.out.println("Question 2- A good hash function does the following-\na)output same hash values for similar keys b)output different hash values for similar keys");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A good hash function should output different hash values for similar keys.");
        }
        System.out.println("Question 3- Which of the following Data Structures is faster?-\na)HashTable b)HashMap");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A Hashmap is faster when compared to a Hashtable.");
        }
        System.out.println("Question 4- Which of the following data Structures maintains the order of insertion-\na)Hashset b)LinkedHashSet");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! LinkedHashSet maintains the order of insertion.");
        }
        System.out.println("Question 5- Which of the following does not allow any null keys and values?-\na)HashTable b)Hashmap");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A Hashtable does not allow null for key as well as for value.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
}
}