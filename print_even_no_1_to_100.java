// Ques: Print all even numbers from 1 to
// 100
package loops;
import java.util.Scanner;
public class print_even_no_1_to_100 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int i = 2 ; i<=100 ; i+=2) {
            System.out.println(i);
        }
    }
}
