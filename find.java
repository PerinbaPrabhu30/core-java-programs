import java.util.Scanner;
public class find{

    void evenorodd(int num)
    {
     if(num%2==0){
         System.out.print("Even number");
     }
     else{
         System.out.print("Odd number");
     }

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = scan.nextInt();

        find obj = new find();
        obj.evenorodd(number);
    }
}