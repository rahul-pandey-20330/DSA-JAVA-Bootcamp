//Take 2 numbers as inputs and find their HCF and LCM.
 
import java.util.Scanner; //import statement should be at the beginning
class LCM 
{
	int lcm(int a, int b)// lcm logic are in this method
	{
		int d;
	//lcm always grater than inputed vale so we start i always garter value so we find grater value for this code 
		if(a>b)
		{
			d=a;
		}
		else
		{
			d=b;
		}
		int ans = 0;
		for(int i = d; i<= a*b ; i++)
		{
			if (i %a == 0 && i %b == 0)
			{
			    ans = i;
				break;
			}
		}
		return ans;
	}
}
class HCF
{
	int Hcf (int x,int y)
	{
		int d;
		if (x<y){
		d=x;
	}
	else 
	{
		d=y;
	}
	int ans =1 ;
	for(int i =d ; i>=1 ;i--)
	{
		if(x % i ==0 && y %i ==0)
		{
			ans = i; 
			break;
		}
	}
	return ans;
}	
}

public class LCM_HCF{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Number to get its LCM  ");
    int num1 = sc.nextInt();
	System.out.print("Enter Second Number to get its LCM ");
	int num2 = sc.nextInt();
	
	LCM lc = new LCM();
	int result1 = lc.lcm(num1 , num2);
	System.out.println("Lcm is :" +result1);
	
	HCF hc = new HCF();
	int result2 = hc.Hcf(num1 , num2);
	System.out.print("HCF is : "+result2);
}
}




