import java.util.Scanner;

public class game{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the game score?");
        int score = scan.nextInt();

        if(score<50){
            System.out.print("You Need to Improve");
        }
        else if(score>=50 && score<=70){
            System.out.print("Good job");
        }
        else {
        System.out.print("excellent performance");
        }
}
}
