package exercise;

public class homework13 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		double d = 0;
		double e = 0;
		for(a = 1;a <= 999;a++)
		{		
			 b = a + 100;
			 c = a + 168;
			 d = Math.sqrt(b);
			 e = Math.sqrt(c);
			if(d % 1 == 0 && e % 1 == 0)
			{
				System.out.println("这个数是:"+a);
			}
		}
	}
}
