package exercise;

public class homework9 {
	public static void main(String[] args) {
		int z = 0;
		double x = 1;
		double y = 1;
		double l = 0;
		for(z = 0;z < 20;z++)
		{
			double i = x;
			double j = y;
			x = i + j;
			y = i;			
			double k = x / y;
			l += k;
		}
		System.out.println("前20项之和为:"+l);
	}
}
