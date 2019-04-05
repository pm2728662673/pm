package exercise;
import java.util.Scanner;
public class homework5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(10000 < a && a < 99999)
		{
			if(a % 10 == a / 10000 && a % 100 / 10 == a  % 10000 / 1000)
			{
				System.out.println("是回文");
			}
			else
			{
				System.out.println("不是回文");
			}
		}
	}
}
