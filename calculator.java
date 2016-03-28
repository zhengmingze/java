package ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.print("��ѡ������1,����2,����3,ʱ��4,����5,Ͷ��6,�����»������7,�˳�8");
		Scanner scanner = new Scanner(System.in);
		int a=0;
	try{
		a = Math.abs(scanner.nextInt());}
		catch(InputMismatchException e){
			main(null);
		}
	input(a);
	scanner.close();
	}

	static void input(int a) {
		Scanner scanner = new Scanner(System.in);
		int k = a;
		String fruit=null;
		try {
			switch (a) {
			case 1: {
				System.out.print("�����뱾��");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������������");
				double rate = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				double C = Math.abs(scanner.nextInt());
			double fruit1=simple_interest(A, rate, C);
				System.out.println("������ֵ" + fruit1);
				main(null);
				
			}
				break;
			case 2: {
				System.out.print("�����뱾��");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������������");
				double B = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				int C = Math.abs(scanner.nextInt());
				fruit=compound_interest(A, B, C);
				System.out.println("������ֵ" + fruit);
				main(null);
			}
				break;
			case 3: {
				System.out.print("������Ԥ��Ǯ��");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������������");
				double rate = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				double C = Math.abs(scanner.nextInt());
				fruit=capital(A, rate, C);
				System.out.println("����" + fruit);
				main(null);
			}
				break;
			case 4: {
				int i=0;
				System.out.print("�����뱾��");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������������");
				double B = Math.abs(scanner.nextDouble());
				System.out.print("������Ԥ�ڽ��");
				double C = Math.abs(scanner.nextDouble());
				i=time(A, B, C);
				System.out.println("��" + i + "��");
				main(null);
			}
				break;
			case 5: {
				System.out.print("�����뱾��");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������Ԥ�ڽ��");
				double B = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				double C = Math.abs(scanner.nextDouble());
				fruit=rate(A, B, C);
				System.out.println("����Ϊ" + fruit);
			main(null);
			}
				break;
			case 6: {
				System.out.print("������Ͷ�ʶ�");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("������������");
				double B = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				int C = Math.abs(scanner.nextInt());
				fruit=invest(A, B, C);
				System.out.println("���ջ���" + fruit);
				main(null);
			}
				break;
			case 7: {
				System.out.print("����������");
				double A = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				double B = Math.abs(scanner.nextDouble());
				System.out.print("�������������");
				int C = Math.abs(scanner.nextInt());
				fruit=repayment(A, B, C);
				//main(null);

			}
				break;
			case 8:scanner.close();
				break;
			default:
				System.out.print("����������");
			}
		} catch (InputMismatchException e) {
			input(k);
		}
	}

	static double simple_interest(double a, double rate, double c) {
		double A = a;
		double D = 1;
		double C = c;
		D = A * rate * C;
		return A+D;
	}
	static String compound_interest(double a2, double b2, int c2) {
		double A = a2;
		double B = b2;
		int C = c2;
		double D = 1;
		for (int i = 1; i <= C; i++) {
			D = D * (1 + B);
		}
		return String.format("%.4f", A*D);
	}
	static String capital(double a2, double rate2, double c2) {
		// TODO Auto-generated method stub
		double A = a2;
		double rate = rate2;
		double C = c2;
		double D = 1;
		for (int i = 1; i <= C; i++) {
			D = D * (1 + rate);
		}

		return String.format("%.4f", A/D);
	}
	static int time(double a2, double b2, double c2) {
		double A = a2;
		double B = b2;
		double C = c2;
		double D = 1;
		double E = 1;
		int i = 1;

		while (true) {
			D = D * (1 + B);
			E = A * D;
			if (E <= C)
				i++;
			else
				break;
		}
		return i;
	}

	static String rate(double a2, double b2, double c2) {
		double A = a2;
		double B = b2;
		double C = c2;
		double D = 1;
		D = Math.pow(B / A, 1 / C) - 1;
		return String.format("%.4f", D);
	}

	static String invest(double a2, double b2, int c2) {
		// TODO Auto-generated method stub
		double A = a2;
		double B = b2;
		int C = c2;
		double D = 0;
		for (int i = 1; i <= C; i++) {
			D = D + A;
			D = D * (1 + B);
		}
		return String.format("%.4f", D);
	}

	static String repayment(double a2, double b2, int c2) {
		// TODO �Զ����ɵķ������
		double A = a2;
		double B = b2;
		int C = c2;
		double D = 0;
		for (int i = 1; i <= C; i++) {
			D = A * Math.pow(1.0 + B, C);
		}
		double Repayment = D / (C * 12);
		double interest = A * B * C;
		double sum = A + interest;
		double Repayment1 = sum / (C * 12);
		System.out.println("ÿ����Ҫ����(����)" + Repayment1);
		System.out.println("ÿ����Ҫ����(����)" + String.format("%.4f", Repayment));
		return String.format("%.4f", Repayment);
	}

}
