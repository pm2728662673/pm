package exercise;

public class homework11 {
	public static void main(String[] args) {
		int n = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		for(n = 1;n <= 10;n++)
		{
			b = Math.pow((2),n);
			c = b - 1;
			a += c;
		}
		System.out.println("n=10时数列和为:"+a);
	}
}
