import java.util.Random;

public class FindStar {
    public static void main(String[] args) {

        int a= 25;
        int[][] star = new int[a][a];
        String[][] outStar = new String[a][a];
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                star[i][j] = random.nextInt(11);
            }
        }

        for (int i = 1; i < a-1; i+=1) {
            for (int j = 1; j < a-1; j+=1) {


//                int current_position = star[i][j];
//                int left_cell = star[i][j - 1];
//                int left_top_cell = star[i - 1][j - 1];
//                int left_bottom_cell = star[i - 1][j];
//
//                int right_cell = star[i][j + 1];
//                int right_top_cell = star[i - 1][j + 1];
//                int right_bottom_cell = star[i + 1][j + 1];
//
//                int up_cell = star[i - 1][j];
//                int bottom_cell = star[i + 1][j];


                if (star[i][j] < star[i][j - 1] && star[i][j] < star[i - 1][j - 1] && star[i][j] < star[i - 1][j] && star[i][j] < star[i][j + 1]
                        && star[i][j] < star[i - 1][j + 1] && star[i][j] < star[i + 1][j + 1] && star[i][j] < star[i - 1][j] && star[i][j] < star[i + 1][j])
                    outStar[i][j] = "* ";
                else
                    outStar[i][j] = "  ";

            }

        }
        for (int i = 1; i < 24; i++) {
            for (int j = 1; j < 24; j++) {
                System.out.print(outStar[i][j]);

            }
            System.out.println();
        }

    }
}
