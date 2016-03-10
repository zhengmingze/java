package ch1;

import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入本金");
		double A=scanner.nextDouble();
		System.out.print("请输入年利率");
		double B=scanner.nextDouble();
		System.out.print("请输入存入年限");
		int C=scanner.nextInt();
		double D=1;
		for(int i=1;i<C;i++)
		{
			D=D*(1+B);
		}
		System.out.print("复利终值"+A*D);
	}

}
