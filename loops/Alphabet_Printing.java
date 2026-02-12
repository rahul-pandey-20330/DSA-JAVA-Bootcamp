// Ques: Print all alphabets with their
// corresponding ASCII values.
import java.util.Scanner;
public class Alphabet_Printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 65;
      
        for (int i =A;i<=90;i++){
              char ch =(char)i ;
        System.out.print(ch+" ");
        }
    }
}