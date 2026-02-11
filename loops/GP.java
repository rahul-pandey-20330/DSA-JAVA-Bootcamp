// Display this GP - 1,2,4,8.. upto ‘n’
// terms formula of GP is:an = a*r pow(n-1)

import java.util.Scanner;
public class GP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Number : ");
        int n = sc.nextInt();

        int num = 1; //first number
        for (int i = 1 ; i<=n ; i++){
            System.out.println(num);
            num *=2; // multiply by common ratio
        }
    }
}

  