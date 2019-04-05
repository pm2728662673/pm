package exercise;

public class homework8 {
	public static void main(String[] args)
	{
		int x = 0;
		for(x = 0;x < 3000;x++)
		{
			if(x % 5 == 1 && x % 6 == 5 && x % 7 ==4 && x % 11 == 10)
			{
				System.out.println("韩信至少有"+x+"个兵");
				break;
			}
		}
	}
}
