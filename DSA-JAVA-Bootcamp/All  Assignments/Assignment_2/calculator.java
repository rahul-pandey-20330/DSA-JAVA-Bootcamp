//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class calculator{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        // take operator
        System.out.println("Enter operator : ");
        char op = sc.next().trim().charAt(0);

        float result = 0; 
        if (op =='+' || op =='-' || op =='*' || op =='/' || op =='%'  )
        {
            System.out.print("Enter first number : ");
            float num1 = sc.nextFloat();
    
            System.out.print("Enter Second number : ");
            float num2 = sc.nextFloat();

            if(op == '+')
            {
                result = num1 + num2;
            }
            else if (op == '-')
            {
                result = num1 - num2;
            }
            else if(op == '*')
            {
                result = num1*num2;
            }
            else if(op == '/')
            {
                result = num1 / num2 ;
            }
            else if(op == '%')
            {
                result = num1 % num2 ;
            }
            System.out.println(result);
        }
        else 
        {
            System.out.println("Please Enter Valid Operator ");
        }
   
    }
}