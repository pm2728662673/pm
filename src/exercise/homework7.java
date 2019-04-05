package exercise;

public class homework7 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for(x = 0;x < 20;x++)
		{
			y = 20 - x;
			if(2 * x + 4 * y == 50)
			{
				System.out.println("鸡有"+x+"只");
				System.out.println("兔有"+y+"只");
				break;
			}		
		}
	}
}
