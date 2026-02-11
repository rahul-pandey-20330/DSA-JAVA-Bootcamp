// Take a number as input and Find its Factorial
import java.util.Scanner;
public class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number to find its Factorial : ");
		int num = sc.nextInt();
		int s = 1;
		for(int i=1; i<=num ;i++){
			s = s*i;
		}
		System.out.print("Factorial of "+num + " is: "+s);
	}
}