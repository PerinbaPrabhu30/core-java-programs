import java.util.Scanner;
import java.util.Arrays;

public class ascendingorder {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = order.nextInt();

        int[] numbers = new int[num];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = order.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Numbers in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
