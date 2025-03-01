//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
public class Year{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year :");
		int num = sc.nextInt();
		if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0) ){
			System.out.print(num+ " is leap Year ");
		}
		else {
			System.out.print(num+ " is not a leap Year ");
		}
		
	}
}