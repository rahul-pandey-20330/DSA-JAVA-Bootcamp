//Input currency in rupees and output in USD.
import java.util.Scanner;
public class converter {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Amount in Rupees : ");
        float rupee =sc.nextFloat(); 

        float USD = (float)(87.47);

        float amount =  rupee / USD;
        System.out.println(rupee+" In USD Is : "+amount + "$");
    }
}
