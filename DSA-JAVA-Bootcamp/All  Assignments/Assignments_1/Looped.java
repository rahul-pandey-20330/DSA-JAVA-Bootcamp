//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package Assignment_1;

import java.util.Scanner;
public class Looped{
    public static  void main(String []args){
    char ch = 'x';
    Scanner sc = new Scanner(System.in);
    System.out.print("Sugegst any character from a to z");
    int  c = sc.nextInt();
    int count = 0;
    int tc = count;
    while(c<ch){
       System.out.print("Try again");
       tc = count++;

       continue;
    }
        if(c == ch){
            System.out.println("You win and you are trying "+tc +"times");
        }
    }
}