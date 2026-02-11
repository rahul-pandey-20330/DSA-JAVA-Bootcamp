// Ques: Take positive integer input and
// print:
// Rahul if number is divisible by 5
// _Aman_ if number is divisible by 3
// Rohit if number is divisible by 5 & 3 both
//  Aadi if number is not divisible by 5 or 3
import java.util.*;
public class name_printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer Number : ");
        int num = sc.nextInt();
        if(num%5==0 && num%3 !=0){
            System.out.println("Rahul");
        }
        else if(num%3==0 && num%5 !=0){
            System.out.println("Aman");
        }
        else if(num%5==0 && num % 3 ==0){
            System.out.println("Rohit");
        }
        else if(num%5==0 || num % 3==0){
            System.out.println("Aadi");
        }
        else {
            System.out.println("Enter Correct Value");
        }
    
    }
}