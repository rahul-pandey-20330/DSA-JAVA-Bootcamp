//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Gretting_Msg {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.next();
         System.out.print("Hello "+ name + " Welcome to my Github Profile");
    }
}
