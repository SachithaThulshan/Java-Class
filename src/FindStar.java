import java.util.Random;

public class FindStar {
    public static void main(String[] args) {

        int a= 25;
        int[][] star = new int[a][a];
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                star[i][j] = random.nextInt(11);
            }
        }

        for (int i = 1; i < a-1; i+=1) {
            for (int j = 1; j < a-1; j+=3) {

                int current_position = star[i][j];
                int left_cell = star[i][j-1];
                int left_top_cell = star[i-1][j-1];
                int left_bottom_cell = star[i-1][j];

                int right_cell = star[i][j+1];
                int right_top_cell = star[i-1][j+1];
                int right_bottom_cell = star[i+1][j+1];

                int up_cell = star[i-1][j];
                int bottom_cell = star[i+1][j];


                if (star[i][j] < left_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] < left_top_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] < left_bottom_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] < right_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] <= current_position)
                    System.out.print("* ");
                if (star[i][j] < right_top_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] < right_bottom_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");
                if (star[i][j] < up_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");

                if (star[i][j] < bottom_cell)
                    System.out.print("* ");
                else
                    System.out.print("| ");

            }
            System.out.println(" ");
        }
    }
}
