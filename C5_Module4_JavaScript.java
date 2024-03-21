import java.util.HashMap;
import java.util.Scanner;

public class C5_Module4_JavaScript {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'a');
        hm.put(2,'a');
        hm.put(3,'c');
        hm.put(4,'a');
        hm.put(5,'b');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 4- Javascript. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- Which of the following is not a primitve datatype in Javascript?\na)Object b)String c)Number d)Boolean");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Object is not a primitive data type.");
        }
        System.out.println("Question 2- In Javascript, what will be the result of 1934==\"1934\"?a)True b)False c)Null d)Error");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! == converts to the same data type.");
        }
        System.out.println("Question 3- Which of the following can be used to replace the content of the parent node in Javascript?\na)appendChild b)createElement c)innerHTML d)getElementbyId");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! InnerHTML is used to replace the content.");
        }
        System.out.println("Question 4- Is Javascript single threaded or Multi threaded?-\na)single-threaded b)multi-threaded");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Javascript is a single threaded language.");
        }
        System.out.println("Question 5- Which of the following prints the output in the terminal?-\na)alert b)console.log");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! console.log prints in terminal, alert is used to notify user.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}
