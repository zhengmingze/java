

import java.text.NumberFormat;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请选择求单利1,复利2,本金3,时间4,利率5,投资6");
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
		case 4:shijian();
		break;
		case 5:lilv();
		break;
		case 6:touzi();
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
static void shijian()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("请输入本金");
	double A=scanner.nextDouble();
	System.out.print("请输入年利率");
	double B=scanner.nextDouble();
	System.out.print("请输入存入预期金额");
	double C=scanner.nextDouble();
	double D=1;
	double E=1;
	int i=1;
	
	while(true)
	{
		D=D*(1+B);
		E=A*D;
		if(E<=C)
		i++;
		else break;
	}
	
	System.out.println("需"+i+"年");
	main(null);
}
static void lilv()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("请输入本金");
	double A=scanner.nextDouble();
	System.out.print("请输入预期金额");
	double B=scanner.nextDouble();
	System.out.print("请输入存入年限");
	double C=scanner.nextDouble();
	double D=1;
		D=Math.pow(B/A, 1/C)-1;
System.out.println("利率为"+String.format("%.4f",D));
	main(null);
}
static void touzi() {
	// TODO Auto-generated method stub
 Scanner scanner=new Scanner(System.in);
	System.out.print("请输入投资额");
	double A=scanner.nextDouble();
	System.out.print("请输入年利率");
	double B=scanner.nextDouble();
	System.out.print("请输入存入年限");
	int C=scanner.nextInt();
	double D=0;
	for(int i=1;i<=C;i++)
	{	
		D=D+A;
		D=D*(1+B);
	}
	System.out.println("最终获利"+String.format("%.4f", D));
	main(null);
}
}

