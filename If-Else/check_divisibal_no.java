//Take positive integer input and tell
// if it is divisible by 5 or not.
import java.util.Scanner;
class check_divisibal_no{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}