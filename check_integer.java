// Ques: Take real number input and check
// if it is an integer or not.
import java.util.Scanner;
public class check_integer {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Real Number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if (num - x>0)//5.4-5.0=0.4 bcz num ko type cast krke x me rkh diya hai and if condition me jb num ko jo agar decimal me hoga and usko hm integer yani x se minus krenge toh x bhi double me convert ho jayega and ans bhi double me aayega and agar value integer hua toh shi value aa jayegi jisse integer value ka pta chl jayega
            {
            System.out.println(num+" Is Not an Integer");
        }
        else{
            System.out.println(num+" Is Integer number");
        }
    }
}