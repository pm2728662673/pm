package exercise;
import java.util.Scanner;
public class homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int �ֱ����� = scanner.nextInt(),�ռǱ����� = scanner.nextInt(),Mp3���� = scanner.nextInt();
		int �������;
		double �ۿ��� = scanner.nextDouble();
		double ʵ����� = scanner.nextDouble();
		double �ֱʽ�� = 0,�ռǱ���� = 0,Mp3��� = 0;
		double ��Ա�����ۿ� = 0;
		double ����ܼ� = 0;
		double ���� = 0;
		double ��� = 0;
		�ֱʽ�� = �ֱ����� * 28.0;
		�ռǱ���� = �ռǱ����� * 15.0;
		Mp3��� = Mp3���� * 128.0;
		����ܼ� = (�ֱʽ�� + �ռǱ���� + Mp3���) * �ۿ���; 
		���� = ʵ����� - ����ܼ�;
		��� = ����ܼ� / 10;
		������� = (int)���;
		System.out.println("********���ѵ�**********");
		System.out.println("��Ʒ        ����        ����       ���");
		System.out.print("�ֱ�      28.0  ");
		System.out.print(" "+�ֱ�����);
		System.out.print("  "+�ֱʽ��);
		System.out.print("\n");
		System.out.print("�ռǱ�  15.0  ");
		System.out.print(" "+�ռǱ�����);
		System.out.print("  "+�ռǱ����);		
		System.out.print("\n");
		System.out.print("Mp3 128.0  ");
		System.out.print(" "+Mp3����);
		System.out.print(" "+Mp3���);
		System.out.print("\n");
		System.out.println("��Ա�����ۿ�:"+ �ۿ���);
		System.out.println("����ܼ�        :��"+ ����ܼ�);
		System.out.println("������        :��"+ ʵ�����);
		System.out.println("����                :��"+ ����);
		System.out.println("�������        :"+ �������);
	}
}
