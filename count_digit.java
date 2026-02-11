// Ques: Take positive integer input and
// tell if it is a four digit number or not.
// import java.util.Scanner;
// public class count_digit {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Any Integer Number: ");
//         int num = sc.nextInt();
       
//         int count = 0;
//         int temp = num;

//         for (; temp > 0; temp = temp / 10) {
//             count++;
//         }

//         if (count == 4) {
//             System.out.println(num + " is a four digit number");
//         } else {
//             System.out.println(num + " is NOT a four digit number");
//         }
//     }
// }
//second way
import java.util.Scanner;
public class count_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer Number: ");
        int num = sc.nextInt();
        if(num>999 && num<10000){
            System.out.println(num+ "Is a Four Digit Number");
        }
        else{
            System.out.println(num+ "Is not a Four Digit Number");
        }
    }
}
