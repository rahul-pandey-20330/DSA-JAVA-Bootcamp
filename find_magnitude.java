// Take integer input and tell if its
// magnitude is smaller than 69 or not.
import java.util.Scanner;
public class find_magnitude {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        if(num<0 ){
            num = -num;
        }
        if (num<69) {
            System.out.println(num+" is smaller then 69");
        }
        else 
            System.out.println(num+" is greater then 69");
        
    }
}