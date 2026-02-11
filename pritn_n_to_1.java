// Print numbers from ‘n’ to 1.
package loops;
import java.util.*;
public class pritn_n_to_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i=num ; i>=1 ; i--){
            System.out.println(i);
        }
    }
}