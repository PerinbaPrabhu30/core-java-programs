import java.util.Scanner;

public class input{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();


        System.out.println("\nThank you, " + name + "!");
        System.out.println("You are " + age + " years old and " + height + " meters tall.");


        scanner.close();
    }
}