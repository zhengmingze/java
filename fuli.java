package ch1;

import java.text.NumberFormat;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("��ѡ����1,����2,����3,ʱ��4,����5");
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
		default:System.out.print("����������");
				main(null);
				
		
		}

}

 static void touzi() {
		// TODO Auto-generated method stub
	 Scanner scanner=new Scanner(System.in);
		System.out.print("�����뱾��");
		double A=scanner.nextDouble();
		System.out.print("������������");
		double B=scanner.nextDouble();
		System.out.print("�������������");
		int C=scanner.nextInt();
		double D=1;
		double E=0;
		for(int i=1;i<=C;i++)
		{
			D=D*(1+B);
			E=E+D;
			
		}
		System.out.println("������ֵ"+String.format("%.4f", A*E+A));
		main(null);
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
static void shijian()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("�����뱾��");
	double A=scanner.nextDouble();
	System.out.print("������������");
	double B=scanner.nextDouble();
	System.out.print("���������Ԥ�ڽ��");
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
	
	System.out.println("��"+i+"��");
	main(null);
}
static void lilv()
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("�����뱾��");
	double A=scanner.nextDouble();
	System.out.print("������Ԥ�ڽ��");
	double B=scanner.nextDouble();
	System.out.print("�������������");
	double C=scanner.nextDouble();
	double D=1;
		D=Math.pow(B/A, 1/C)-1;
System.out.println("����Ϊ"+String.format("%.4f",D));
	main(null);
}
}

