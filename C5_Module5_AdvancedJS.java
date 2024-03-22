import java.util.HashMap;
import java.util.Scanner;

public class C5_Module5_AdvancedJS {
     public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'b');
        hm.put(2,'b');
        hm.put(3,'a');
        hm.put(4,'c');
        hm.put(5,'b');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 5- Advanced Javascript. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- How are the values of custom data types like objects and arrays passed in Javascript?\na)Pass by value b)Pass by reference");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Objects are passed by reference unlike primtive data types.");
        }
        System.out.println("Question 2- What would be the result of the following code snippet?\nfunction foobar()\n{(var x= 22)};\nvar x= 11;\nfoobar();\nconsole.log(x);\na)22 b)11");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! x declared inside function has local scope, hence 11 will be printed as it is stored in global scope.");
        }
        System.out.println("Question 3- Hoisting in Javascript moves all declarations to top of the script by default.\nTrue or False?\na)True b)False");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! It is True, hoisting is default behaviour in Javascript.");
        }
        System.out.println("Question 4- In Javascript, which of the following methods allow reuse of function on different objects?-\na)call() b)apply() c)Both d)bind()");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Both Call and Apply allow re-use of functions on different objects.");
        }
        System.out.println("Question 5- Is Javascript Synchronous or Asynchronous?-\na)Synchronous b)Asynchronous");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Javascript is asynchronous.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}
