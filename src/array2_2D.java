import java.util.Scanner;

public class array2_2D {
    public static void main(String[] args) {

        boolean found = false;
        int mark = 0;

        String [][] names = {
                {"kasun","50"},
                {"supun","60"},
                {"pasindu","80"},
                {"kalum","90"},
                {"yasiru","43"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.next();

        for (int i = 0; i < names.length; i++) {
            if (names[i][0].equals(name)) {
                found = true;
                mark = Integer.parseInt(names[i][1]);
                break;
            }

        }
        if (found)
            System.out.println(name +" mark is" + mark);
        else
            System.out.println("cnnot find");

    }
}

// Student names & marks given by user code


//        boolean found = false;
//        int mark = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        String[][] data = new String[5][5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter 5 Names: ");
//            data[0][i] = scanner.nextLine();
//        }
//        System.out.println("-------------------------------------------");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter 5 Marks: ");
//            data[1][i] = scanner.next();
//        }
//
//        System.out.print("Enter Student name find the mark: ");
//        String name = scanner.next();
//
//        for (int i = 0; i < data.length; i++) {
//            if (data[0][i].equalsIgnoreCase(name)){
//                found = true;
//                mark = Integer.parseInt(data[1][i]);
//                break;
//            }
//        }
//
//        if (found)
//            System.out.println(name + " Mark is : " + mark);
//        else
//            System.out.println("Can't Find Student name 😌");
//    }
//}
