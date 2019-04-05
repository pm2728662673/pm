package exercise;

public class homework12 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for(a = 100;a <= 999;a++)
		{
			b = a / 100 % 10 ;
			c = a / 10 % 10;
			d = a / 1 % 10;
			e = b * b * b + c * c * c + d * d * d;
			if(e == a)
			{
				System.out.println("Ë®ÏÉ»¨Êý:"+e);
			}
		}
		
	}
}
