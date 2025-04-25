import java.util.Scanner;

public class loop{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b = scan.nextInt();

        for( int i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
}