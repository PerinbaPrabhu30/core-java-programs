import java.util.Scanner;

public class score{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Score: ");
        int Score = scan.nextInt();

        if(Score>=35){
            System.out.print("You are Pass");
        }
        else{
            System.out.print("You are Fail");
        }
    }
}