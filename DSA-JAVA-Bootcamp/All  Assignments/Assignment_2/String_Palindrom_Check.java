//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class String_Palindrom_Check {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String to check it is palindrome or not : ");
        String str = sc.nextLine();
        if (Palindrom_Check(str)){
            System.out.println(str + " is Palindrome String");
        }
        else
        {
            System.out.println(str +" is not a Palindrome String");
        }
    }
    public static boolean Palindrom_Check(String str)
    {
        str = str.toLowerCase();
        int left = 0 , right = str.length()-1;
        while (left<right) 
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            
            
                left ++;
                right--;
        }
        return true;

    }
}
