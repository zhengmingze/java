package ch1;

import java.text.NumberFormat;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("��ѡ����1,����2,����3");
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
		default:System.out.print("����������");
				main(null);
				
		
		}

}

 static void benjin() {
		// TODO Auto-generated method stub
	 Scanner scanner=new Scanner(System.in);
		System.out.print("������Ԥ��Ǯ��");
		double A=scanner.nextDouble();
		System.out.print("������������");
		double B=scanner.nextDouble();
		System.out.print("�������������");
		int C=scanner.nextInt();
		double D=1;
		for(int i=1;i<=C;i++)
		{
			D=D*(1+B);
		}
		System.out.println("����"+String.format("%.4f", (A/D)));
		main(null);
	}
 

static void fulili()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("�����뱾��");
	double A=scanner.nextDouble();
	System.out.print("������������");
	double B=scanner.nextDouble();
	System.out.print("�������������");
	int C=scanner.nextInt();
	double D=1;
	for(int i=1;i<=C;i++)
	{
		D=D*(1+B);
	}
	System.out.println("������ֵ"+String.format("%.4f", (A*D)));
	main(null);
}
static void danli()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("�����뱾��");
	double A=scanner.nextDouble();
	System.out.print("������������");
	double B=scanner.nextDouble();
	System.out.print("�������������");
	int C=scanner.nextInt();
	double D=1;
	D=A*B*C;
	System.out.println("������ֵ"+(A+D));
	main(null);
}
}