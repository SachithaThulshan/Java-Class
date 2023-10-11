import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        boolean found = false;
        int ms = 0;
//        String [][] names = new String[5][2];
        String [][] names = {
                {"kasun","50"},
                {"supun","60"},
                {"pasindu","80"},
                {"kalum","90"},
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (names[i][0].equals(name)) {
                found = true;
                ms = Integer.parseInt(names[i][1]);
                break;

            }

        }
        if (found)
            System.out.println(name +" mark is" + ms);
        else
            System.out.println("cnnot find");


//        for (int i = 0; i < 5; i++) {
//            System.out.println("enter names");
//            String name = scanner.next();
//            names[0][i] = name;
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("enter marks");
//            String name = scanner.next();
//            names[1][i] = name;
//        }

    }
}
