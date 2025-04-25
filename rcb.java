import java.util.Scanner;

public class rcb{
    public static void main(String args[])
    {
        Scanner match = new Scanner(System.in);
        System.out.print("RCB is Win or Lose: ");

        String RCB = match.nextLine();

        if(RCB.equals("win"))
        {
            System.out.print("Ee Sala cup namdhey");
        }
        else{
            System.out.print("no cup");
        }

    }
}
