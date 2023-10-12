import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {

        int[] values = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + " Enter 10 numbers: ");
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < values.length; i++) {
            Arrays.sort(values);
            System.out.print(values[i] + " ");
        }

    }
}
