// HW: Print this series - 99,95,91,87,.. upto
// all terms which are positive
import java.util.Scanner;
public class series_printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Printing Series Like This: ");
        int a = sc.nextInt();
        
        for (int i = a;i>=0 ; i-=4){
            System.out.println(i);
        }
    }
}