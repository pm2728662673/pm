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
				System.out.println("����������ݴ���");
			}
			else if(a < n)
			{
				System.out.println("�����������С��");
			}
			else
			{
				System.out.println("�������");
				System.out.println("����"+n);
			}
			count = count + 1;
			System.out.println("������"+count+"��");
		}	
	}	
}
