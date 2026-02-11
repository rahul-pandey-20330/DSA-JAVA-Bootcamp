// Ques: Take integer input and print the
// absolute value of that integer
import java.util.Scanner;
public class PrintInteger {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Number: ");
    int num = sc.nextInt();
    if(num<=0 ){
        num = -num;
        System.out.print("number is : "+num);
    }
}
}