import java.util.Scanner;
public class Calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float ans = 0;
        //Take input from user until user doesn't press x or X
        while(true){
            //take operatoe as input
            System.out.print("Enter Operator : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //input two numbers from user
                System.out.print("Enter First Number : ");
                int num1 = sc.nextInt(); 
                System.out.print("Enter Second Number : ");
                int num2 = sc.nextInt();
                //apply condition based on opoerator
                if(op == '+'){
                    ans = num1+num2;
                }
                else if(op == '-'){
                    ans = num1 - num2;
                }
                else if(op == '*'){
                    ans = num1 * num2;
                }
                else if(op == '/'){
                    ans = (float) num1/num2;
                }
                else if (op == '%'){
                    ans = (int) num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operator Please Enter Correct Operator ");
            }
            System.out.println("Your Result is : "+ans +"\n");
        } 
    }
}
