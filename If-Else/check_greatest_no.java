// HW: Take length and breadth of
// rectangle as input and write a program
// to find whether the area of rectangle is
// greater than its perimeter.
import java.util.Scanner;
public class check_greatest_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Rectangel : ");
        double len = sc.nextDouble();
        System.out.print("Enter Breadth Of Rectangel : ");
        double breadth = sc.nextDouble();
        double area = len*breadth;
        double parameter = 2*(len+breadth);
        if(area>parameter){
            System.out.println("Area Of Reactangel Is Greatst ");
        }
        else if(parameter>area){
            System.out.println("Parameter Is Greatest Than Area");
        }
        else
            System.out.println("Both Are Equal");
    }
}