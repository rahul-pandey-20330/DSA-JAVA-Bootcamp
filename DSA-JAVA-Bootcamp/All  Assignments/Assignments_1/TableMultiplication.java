//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class TableMultiplication{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number For Its Table Multiplication :");
		int num = sc.nextInt();
		System.out.print("Table of "+num + " is :\n");
			for(int i=1 ; i<=10 ; i++){
				System.out.print(num +"x" +i +"="  +(num*i) +"\n");

		}
	}
}