package exercise;

public class homework14 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println("��1���µ�������"+b+"ֻ");
		System.out.println("��2���µ�������"+c+"ֻ");
		for(a = 3;a <= 10;a++)
		{
			int d = b;
			int e = c;
			b = d + e;
			c = d;
			System.out.println("��"+a+"���µ�������"+b+"ֻ");
		}
	}
}

