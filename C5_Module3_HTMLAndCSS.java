import java.util.HashMap;
import java.util.Scanner;
public class C5_Module3_HTMLAndCSS {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        hm.put(1,'d');
        hm.put(2,'c');
        hm.put(3,'c');
        hm.put(4,'a');
        hm.put(5,'b');
        int score =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the questionnaire for module 3- HTML and CSS. \n The answers for each question in the following quiz are stored in a hashmap in a key-value pair!!");
        System.out.println("Question 1- Which of the following are inline elements in HTML??\na)<p> b)<h1> c)<div> d)<img>");
        char answer1 = input.next().charAt(0);
        if(answer1==hm.get(1)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! <img> is an in-line element.");
        }
        System.out.println("Question 2- Which of the following methods to apply CSS have the most priority?\na)internal CSS b)external CSS c)in-line CSS d)multiple stylesheets");
        char answer2 = input.next().charAt(0);
        if(answer2==hm.get(2)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! In-line CSS has the most priority.");
        }
        System.out.println("Question 3- Which of the following can we use to style a text in bold?\na)<b> b)font-weight: bold c)Both a and B d)font-family: bold");
        char answer3 = input.next().charAt(0);
        if(answer3==hm.get(3)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! You can use a <b> tag before the text and also add font-weigth:bold to style a text in bold.");
        }
        System.out.println("Question 4- Which of the following is NOT a valid CSS selector to style a specific element which has been repeated many times?-\na)element b) c)id d) class d)div");
        char answer4 = input.next().charAt(0);
        if(answer4==hm.get(4)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! An element selector will apply the style to all the elements of the tag instead of a specific one.");
        }
        System.out.println("Question 5- What helps in CSS to include properties based on if a condition is true?-\na)viewport b)media queries c)frameworks d)templates");
        char answer5 = input.next().charAt(0);
        if(answer5==hm.get(5)){
            System.out.println("Correct Answer!!");
            score++;
        }
        else{
            System.out.println("Wrong! Media queries, introduced in CSS3 help in including a block of elements if a condition is met.");
        }
        System.out.println("Your final score is " + score + " out of 5 questions.");
        input.close();
}
}

