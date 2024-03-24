import java.util.HashMap;
import java.util.Scanner;

public class C5_Module6_BackendIntergrationUsingHTTP {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'a');
        hm.put(2,'b');
        hm.put(3,'d');
        hm.put(4,'b');
        hm.put(5,'a');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 5- Backend Integration using HTTP. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- In the URL 'https://www.google.com/imghp' , what does 'www' represent?\na)subdomain b)domain c)protocol d)subdirectory");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! www is the subdomain.");
        }
        System.out.println("Question 2- URN gives us the location of the resource. True or false?\na)True b)False");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! URN gives name of a resource, URL gives location of a resource.");
        }
        System.out.println("Question 3- Suppose we are given are response code 502 from the server. What would that represent?\na)Client error b)Success c)Redirection d)Server Error");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Server error are in the form 5XX.");
        }
        System.out.println("Question 4- Which of the following JSON methods are used to convert a string into an object?-\na)stringify() b)parse()");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! parse converts string to object and stringify converts object to string.");
        }
        System.out.println("Question 5- Which of the following can store more data on user's browser?-\na)Session Storage b)Cookie");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! A cookie has only 4kb storage whereas session and local storage can store more than 5mb.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}
