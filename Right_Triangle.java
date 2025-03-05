import java.util.*;
public class Right_Triangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value :");
        int n=sc.nextInt();  // Take user Inpute

        for(int i=1; i<=n; i++){

            for(int j=1;j<=i; j++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
