import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n=sc.nextInt(); // Take user Inpute

        for(int i=1; i<=n; i++){
            for(int s=n; s>=i; s--){
                System.out.print(" "); // Take  Space 
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
}
