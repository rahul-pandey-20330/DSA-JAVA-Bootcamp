// Print the table of 19↳ 17
package loops;
import java.util.Scanner;
public class table {

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 19;
        for(int i = 1;i<=10 ;i++){
            System.out.println(num1*i + "    "+ num2*i);
        }
    }
}