// Ques: Display this AP - 2,5,8,11.. upto ‘n’
// terms  
// an = a + (n -1)d         (d=a2-a1,(a2=5,a1=2))
// 2 + (n1).3
// 2 + 3n -3
// an = 3n-1
package loops;
import java.util.Scanner;
public class Print_AP {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your nth Number: "); 
       int num = sc.nextInt();
       for (int i = 2 ; i<=3*num-1 ; i+=3){
        System.out.print(i+" ");
       }
    }
}