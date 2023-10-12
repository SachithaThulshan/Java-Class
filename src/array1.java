import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] student = new double[5];
        double max = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Height: ");
            double height = scanner.nextDouble();
            student[i] = height;
        }

        for (int j = 0; j < student.length; j++) {
            if (max < student[j])
                max = student[j];
        }
        System.out.println("Max Highest Student Hight " + max);
    }
}