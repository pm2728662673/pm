package exercise;
import java.util.Scanner;
public class homework6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int n = (int)(Math.random()*100);
		while(true)
		{	
			int a = input.nextInt();
			if(a > n)
			{
				System.out.println("你输入的数据大了");
			}
			else if(a < n)
			{
				System.out.println("你输入的数据小了");
			}
			else
			{
				System.out.println("你真聪明");
				System.out.println("答案是"+n);
			}
			count = count + 1;
			System.out.println("共猜了"+count+"次");
		}	
	}	
}
