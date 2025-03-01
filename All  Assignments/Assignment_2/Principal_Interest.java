//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Principal_Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        int principal_amount = sc.nextInt();

        System.out.print("Enter Rate of Interest : ");
        int rate = sc.nextInt();

        System.out.print("Enter Time in Year :");
        int time = sc.nextInt();

        int Total_Interest = (principal_amount * rate * time ) / 100;

        System.out.println("Total Interest is : "+Total_Interest);
    }
}