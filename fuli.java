package ch1;

import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner=new Scanner(System.in);
		System.out.print("�����뱾��");
		double A=scanner.nextDouble();
		System.out.print("������������");
		double B=scanner.nextDouble();
		System.out.print("�������������");
		int C=scanner.nextInt();
		double D=1;
		for(int i=1;i<C;i++)
		{
			D=D*(1+B);
		}
		System.out.print("������ֵ"+A*D);
	}

}
