import java.util.Scanner;

class age {
    public static void main(String args[]) {

        Scanner java = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = java.nextLine();

        System.out.print("Enter your age: ");
        int age = java.nextInt();

        System.out.println("Iam " +name+ " My age is " +age+ ".");



        java.close();
    }
}