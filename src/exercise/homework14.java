package exercise;

public class homework14 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println("第1个月的兔子有"+b+"只");
		System.out.println("第2个月的兔子有"+c+"只");
		for(a = 3;a <= 10;a++)
		{
			int d = b;
			int e = c;
			b = d + e;
			c = d;
			System.out.println("第"+a+"个月的兔子有"+b+"只");
		}
	}
}

