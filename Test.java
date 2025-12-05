import java.util.Scanner;

public class Test{
    public static void main(String [] args){
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Press Enter to start...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Quiz game started!");
        String question [] = {
            "What is the capital of France?\n(a) Berlin\n(b) Madrid\n(c) Paris\n(d) Rome",
            "What is 2 + 2?\n(a) 3\n(b) 4\n(c) 5\n(d) 6",
            "Which planet is known as the Red Planet?\n(a) Earth\n(b) Mars\n(c) Jupiter\n(d) Saturn"
        };
        char answer[] = {'c','b' ,'b'};
        int score = 0;


        for(int i=0; i<question.length; i++){
        System.out.println(question[i]);
        System.out.print("Your answer: ");
        char userAnswer = scanner.next().charAt(0);
        if(userAnswer == answer[i]){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is " + answer[i]);
        }
    }    scanner.close();
        
    }
    


}