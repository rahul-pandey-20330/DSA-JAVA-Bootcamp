// HW: Take ‘n’ as input from user and
// print the following sequence.. 
//1, n ,2 ,n-1 ,3 ,n-2...
import java.util.Scanner;
public class sequence_Printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int end = num;
        for(int i = 1 ; i<=num/2;i++){
            System.out.print(i +" ");
            System.out.print(end+" ");
            end--;
        }
        if(num % 2 != 0) {
            System.out.print((num/2) + 1);
        }
           
    }
}