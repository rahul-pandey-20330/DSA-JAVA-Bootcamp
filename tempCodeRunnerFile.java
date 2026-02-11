// HW: Given a point (x, y), write a program
// to find out if it lies in the 1st Quadrant,
// 2nd Quadrant, 3rd Quadrant, 4th
// Quadrant, on the x-axis, y-axis or at the
// // origin.
// Quadrant	Condition
// 1st Quadrant	x > 0 and y > 0
// 2nd Quadrant	x < 0 and y > 0
// 3rd Quadrant	x < 0 and y < 0
// 4th Quadrant	x > 0 and y < 0 
// Axis (when point lies ON an axis)
// Condition	    Result
// x = 0 and y ≠ 0	Y-axis
// y = 0 and x ≠ 0	X-axis
// x = 0 and y = 0	Origin

import java.util.Scanner;
public class find_qudrates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of x: ");
        double x = sc.nextDouble();
        System.out.println("Enter Value of y: ");
        double y = sc.nextDouble();
        if(x>0 && y>0){
            System.out.println("Number Is in First Qudrate");
        }
        else if(x < 0 && y > 0){
            System.out.println("This Is in 2nd Qudrate bcz x<0 and y>0 ");
        }
        else if (x < 0 && y < 0) {
            System.out.println("This is in Thirds Qudrate bcz x<0 and y<0");
        }
        else if (x > 0 && y < 0 ) {
            System.out.println("This Number Is in Fourth Qudrate bcz x>0and y<0");
        }
    }
}
