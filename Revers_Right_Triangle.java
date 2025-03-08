import java.util.*;

public class revers_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows number : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }

}
