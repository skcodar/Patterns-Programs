import java.util.*;
public class Left_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt();// Take user Inpute

        for(int i = 1; i<=n; i++){
            
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");// This Loop take space
            }

            for(int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
}
