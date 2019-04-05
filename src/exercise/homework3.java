package exercise;
import java.util.Scanner;
public class homework3 {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("**********消费清单**********");
	int g = input.nextInt();
	int b = input.nextInt();
	int e = input.nextInt();
	System.out.print("\t亲，一共行驶");
	int a = 3;
	System.out.println(""+b+"公里");
	int c = 0;
	System.out.print("\t        等待时间");
	System.out.println(""+e+"分钟");
	double d = 0;
	double f,i;
	c = b - a;
	i = e / 5;
		if(g >= 6 && g < 18)
		{
			if(7 >= c && c > 0)
			{
				d = 2.4 * c + 12;
			}
			else if(c > 7)
			{
				d = 3.6 * (c-7) + 2.4 * 7 + 12;	
			}
			f = i* 2 + d;
			System.out.print("\t   收取费用￥"+f+"元");
		}
		if(g > 0 && g < 6 || g>= 18 && g<=24)
		{
			if(7 > c && c > 0)
			{
				d = 3.1 * c + 16;
			}
			else if(c > 7)
			{
				d = 4.7 * (c-7) + 3.1*7 + 16;
			}
			f = i * 2 + d;
			System.out.print("\t   收取费用￥"+f);
			System.out.print("元");
		}
	}
}