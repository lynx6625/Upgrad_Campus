import java.util.HashMap;
import java.util.Scanner;

public class C6_Module1_ReactjsPart1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'b');
        hm.put(2,'b');
        hm.put(3,'b');
        hm.put(4,'b');
        hm.put(5,'b');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 1- React.js Part 1. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- Fill in the blanks. React is a Javascript ________ . ?\na)framework b)library");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! React is a library.");
        }
        System.out.println("Question 2- For the following code-\nlet name = \"Upgrad\"; \nWhich of the following is accurate for dynamically injecting data in React?\na)I love $name  b)I love {name}");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Curly braces are used to reference a variable, hence {name} is correct.");
        }
        System.out.println("Question 3- In ReactDOM.render() method, which argument tells where the element should rendered?\na)First argument of ReactDOM.render() b)Second argument of ReactDOM.render()");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Second argument specifies location where first element specifies which element to render.");
        }
        System.out.println("Question 4- Which of the following can not have state in react?-\na)class component b)functional component");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Only class component can have state.");
        }
        System.out.println("Question 5- Which is the correct order for component life cycle in mounting process?\n1)render\n2)constructor()\n3)componentDidMount()\nselect correct order-\na)3 -> 1 -> 2 b)2 -> 1 -> 3");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! The correct order is constructor->render->componentDidMount.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}
