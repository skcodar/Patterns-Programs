public class Diamond {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


        for (int i = rows - 1; i >= 1; i--) {
            for (int s = rows; s > i; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
