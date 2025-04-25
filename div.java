import java.util.Scanner;

public class div{
    public static void main(String args[])
        {

         Scanner pp = new Scanner(System.in);
         System.out.print("Enter a Number: ");
         int number = pp.nextInt();


         if(number%3==0 && number%5==0){
             System.out.print("The number is divisible by 3 and 5");
        }
         else{
             System.out.print("The number is not divisible by 3 and 5");
        }
        }

        }