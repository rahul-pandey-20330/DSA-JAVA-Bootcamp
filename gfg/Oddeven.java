// Take positive integer input and
// tell if it is odd or even
package gfg;
import java.util.Scanner;

class Oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number Is Even");
        }
        else
            System.out.println("Odd Number");
    }
}
