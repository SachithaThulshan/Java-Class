import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {

        int[] code = {10,20,30,40,50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("{10,20,30,40,50}");
        System.out.println("Enter swap number 1 : ");
        int swap1 = scanner.nextInt();
        System.out.println("Enter swap number 2 : ");
        int swap2 = scanner.nextInt();

        int store2 = code[swap2-1];
        int store1 = code[swap1-1];

        code[swap1-1]=store2;
        code[swap2-1]=store1;

        for (int i : code) {
            System.out.print(i + " ");
        }


    }
}
//this are one stored(temp) using

// int temp = code[swap1-1];
//         System.out.println(temp);

//         code[swap1-1]=code[swap2-1];
//         code[swap2-1]=temp;
