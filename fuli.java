package ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		System.out.print("��ѡ������1,����2,����3,ʱ��4,����5,Ͷ��6,�����»������7,�˳�8");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			danli();
			break;
		case 2:
			fulili();
			break;
		case 3:
			benjin();
			break;
		case 4:
			shijian();
			break;
		case 5:
			lilv();
			break;
		case 6:
			touzi();
			break;
		case 7:
			huankuan();
			break;
		case 8:
			break;
		default:
			System.out.print("����������");
			main(null);
			scanner.close();

		}

	}

	static void benjin() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("������Ԥ��Ǯ��");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			for (int i = 1; i <= C; i++) {
				D = D * (1 + B);
			}
			System.out.println("����" + String.format("%.4f", (A / D)));
		} catch (InputMismatchException e) {
			benjin();
		}
		main(null);
		scanner.close();
	}

	static void fulili() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("�����뱾��");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			for (int i = 1; i <= C; i++) {
				D = D * (1 + B);
			}
			System.out.println("������ֵ" + String.format("%.4f", (A * D)));
		} catch (InputMismatchException e) {
			fulili();
		}
		main(null);
		scanner.close();
	}

	static void danli() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("�����뱾��");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			D = A * B * C;
			System.out.println("������ֵ" + (A + D));
		} catch (InputMismatchException e) {
			danli();
		}
		main(null);
		scanner.close();
	}

	static void shijian() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("�����뱾��");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("������Ԥ�ڽ��");
			double C = Math.abs(scanner.nextDouble());
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

			System.out.println("��" + i + "��");
		} catch (InputMismatchException e) {
			shijian();
		}
		main(null);
		scanner.close();
	}

	static void lilv() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("�����뱾��");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������Ԥ�ڽ��");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			double C = Math.abs(scanner.nextDouble());
			double D = 1;
			D = Math.pow(B / A, 1 / C) - 1;
			System.out.println("����Ϊ" + String.format("%.4f", D));
		} catch (InputMismatchException e) {
			lilv();
		}
		main(null);
		scanner.close();
	}

	static void touzi() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("������Ͷ�ʶ�");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			int C = Math.abs(scanner.nextInt());
			double D = 0;
			for (int i = 1; i <= C; i++) {
				D = D + A;
				D = D * (1 + B);
			}
			System.out.println("���ջ���" + String.format("%.4f", D));
		} catch (InputMismatchException e) {
			touzi();
		}
		main(null);
		scanner.close();
	}

	static void huankuan() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("����������");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("�������������");
			int C = Math.abs(scanner.nextInt());
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
		} catch (InputMismatchException e) {
			huankuan();
		}
		main(null);
		scanner.close();
	}

}
