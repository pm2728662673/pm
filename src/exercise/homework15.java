package exercise;

public class homework15 {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int count = 0;
		for(a = 1;a <= 4;a++)
		{
			for(b = 1;b <= 4;b++)
			{
				for(c = 1;c <= 4;c++)
				{
						if(a != b && b != c && c != a)
						{
							d = 100 * a + 10 * b + c;
							count = count + 1;
							System.out.print("第"+count+"个是:");
							System.out.println(d);	
						}
					}					
				}	
			}
			System.out.println("共"+count+"个");
		}
	}
