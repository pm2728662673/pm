package exercise;

public class homework10 {
	public static void main(String[] args) {
		int n = 0;
		double l = 0;
		double x = 0;
		for(n = 0;n < 100;n++)
		{
			double i = Math.pow((-1),n);
			double j = n+1;
			l = i / j;
			x += l;
		}
		System.out.println(""+x);
	}
}
