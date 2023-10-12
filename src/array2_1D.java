import java.util.Scanner;

public class array2_1D {
    public static void main(String[] args) {

        // 1D array data type used twice
        int[] marks = {50,45,75,46,100};
        String[] names = {"kasun","pradeep","shehara","damith","heshan"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        boolean found = false;
        int mark = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                found = true;
                mark = marks[i];
                break;
            }
        }
        if (found)
            System.out.println(name + " marks is: " + mark);
        else
            System.out.println("not found student name");
    }
}
