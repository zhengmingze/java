package ch1;

import java.text.NumberFormat;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请选择单利1,复利2,本金3");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		switch(a)
		{
		case 1:danli();
		break;
		case 2: fulili();
		break;
		case 3:benjin();
		break;
		default:System.out.print("请重新输入");
				main(null);
				
		
		}

}

 static void benjin() {
		// TODO Auto-generated method stub
	 Scanner scanner=new Scanner(System.in);
		System.out.print("请输入预期钱数");
		double A=scanner.nextDouble();
		System.out.print("请输入年利率");
		double B=scanner.nextDouble();
		System.out.print("请输入存入年限");
		int C=scanner.nextInt();
		double D=1;
		for(int i=1;i<=C;i++)
		{
			D=D*(1+B);
		}
		System.out.println("本金"+String.format("%.4f", (A/D)));
		main(null);
	}
 

static void fulili()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("请输入本金");
	double A=scanner.nextDouble();
	System.out.print("请输入年利率");
	double B=scanner.nextDouble();
	System.out.print("请输入存入年限");
	int C=scanner.nextInt();
	double D=1;
	for(int i=1;i<=C;i++)
	{
		D=D*(1+B);
	}
	System.out.println("复利终值"+String.format("%.4f", (A*D)));
	main(null);
}
static void danli()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("请输入本金");
	double A=scanner.nextDouble();
	System.out.print("请输入年利率");
	double B=scanner.nextDouble();
	System.out.print("请输入存入年限");
	int C=scanner.nextInt();
	double D=1;
	D=A*B*C;
	System.out.println("单利终值"+(A+D));
	main(null);
}
}