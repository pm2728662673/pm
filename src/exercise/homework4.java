package exercise;
import java.util.Scanner;
public class homework4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(90 <= a && a <= 100) 
		{
			System.out.println("优");
		}
		if(80 <= a && a < 90)
		{
			System.out.println("良");
		}
		if(70 <= a && a < 80)
		{
			System.out.println("中");
		}
		if(60 <= a && a < 70)
		{
			System.out.println("差");
		}
		if(60 > a)
		{
			System.out.println("不及格");
		}
		if(0 < a && a>100)
		{
			System.out.println("输入有误");
		}
	}
}
