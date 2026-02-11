// Ques: If cost price and selling price of an
// item is input through the keyboard, write a
// program to determine whether the seller
// has made profit or incurred loss or no profit
// no loss. Also determine how much profit he
// made or loss he incurred.
import java.util.Scanner;
public class Profit_Lost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price : ");
        double sp = sc.nextDouble();
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        if(sp>cp){
            System.out.println("You Earned Profit Of Rs "+(sp-cp)+"₹");
        }
        else
            System.out.println("You are in loss of Rs "+(cp-sp)+"₹");
    }
}