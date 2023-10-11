import java.util.Scanner;

public class array3 {
    public static void main(String[] args){

        String[] data = new String[5];
        Scanner  scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("enter values : ");
            String value = scanner.next();
            data[i] = value;
        }
        for (int i = data.length-1; i >= 0; i--) {
            System.out.println(data[i]);
        }

    }
}
