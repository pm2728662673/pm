package exercise;
import java.util.Scanner;
public class homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 钢笔数量 = scanner.nextInt(),日记本数量 = scanner.nextInt(),Mp3数量 = scanner.nextInt();
		int 所获积分;
		double 折扣率 = scanner.nextDouble();
		double 实付金额 = scanner.nextDouble();
		double 钢笔金额 = 0,日记本金额 = 0,Mp3金额 = 0;
		double 会员享受折扣 = 0;
		double 金额总计 = 0;
		double 找零 = 0;
		double 结果 = 0;
		钢笔金额 = 钢笔数量 * 28.0;
		日记本金额 = 日记本数量 * 15.0;
		Mp3金额 = Mp3数量 * 128.0;
		金额总计 = (钢笔金额 + 日记本金额 + Mp3金额) * 折扣率; 
		找零 = 实付金额 - 金额总计;
		结果 = 金额总计 / 10;
		所获积分 = (int)结果;
		System.out.println("********消费单**********");
		System.out.println("商品        单价        数量       金额");
		System.out.print("钢笔      28.0  ");
		System.out.print(" "+钢笔数量);
		System.out.print("  "+钢笔金额);
		System.out.print("\n");
		System.out.print("日记本  15.0  ");
		System.out.print(" "+日记本数量);
		System.out.print("  "+日记本金额);		
		System.out.print("\n");
		System.out.print("Mp3 128.0  ");
		System.out.print(" "+Mp3数量);
		System.out.print(" "+Mp3金额);
		System.out.print("\n");
		System.out.println("会员享受折扣:"+ 折扣率);
		System.out.println("金额总计        :￥"+ 金额总计);
		System.out.println("付款金额        :￥"+ 实付金额);
		System.out.println("找零                :￥"+ 找零);
		System.out.println("所获积分        :"+ 所获积分);
	}
}
