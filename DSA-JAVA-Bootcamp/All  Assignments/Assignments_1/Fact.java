package Assignment_1;// Take a number as input and Find its own Power(n power n)
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        int num = sc.nextInt();
        int n = 1;
        for( int i = 1; i<=num ; i++){
            n = n*num;
        }
        System.out.print(n);

    }
}