package exercise;
import java.util.Scanner;
public class homework4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(90 <= a && a <= 100) 
		{
			System.out.println("��");
		}
		if(80 <= a && a < 90)
		{
			System.out.println("��");
		}
		if(70 <= a && a < 80)
		{
			System.out.println("��");
		}
		if(60 <= a && a < 70)
		{
			System.out.println("��");
		}
		if(60 > a)
		{
			System.out.println("������");
		}
		if(0 < a && a>100)
		{
			System.out.println("��������");
		}
	}
}
