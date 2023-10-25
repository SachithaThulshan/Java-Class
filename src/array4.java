import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {

        int[] code = {10,20,30,40,50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("{10,20,30,40,50}");
        System.out.print("Enter swap number 1 : ");
        int swap1 = scanner.nextInt();
        System.out.print("Enter swap number 2 : ");
        int swap2 = scanner.nextInt();

        int temp = code[swap1-1];
        System.out.println(temp);

        code[swap1-1]=code[swap2-1];
        code[swap2-1]=temp;

        for (int i : code) {
            System.out.print(i + " ");
        }
    }
}
