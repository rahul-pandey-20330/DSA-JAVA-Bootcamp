// Ques: Print _Rahul_ ‘n’ times. Take ‘n’
// input from user
import java.util.Scanner;
public class Ntime_print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Printing Value: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+". Rahul");
        }
    }
}