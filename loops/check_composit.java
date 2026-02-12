//  WAP to print if number is composite or not. (any number that have more then 2 factor)
import java.util.Scanner;
public class check_composit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        if(n<=1){
            System.out.println("Not a Composit Number Nither Prime Number");
            return;
        }

        boolean isComposit = false;
        for (int i = 2 ;i<n/2 ; i++){
            if (n%i==0) {
                isComposit = true;
                break;
            }
        }
        if(isComposit){
            System.out.print("Composit Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
