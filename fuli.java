package ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		System.out.print("请选择求单利1,复利2,本金3,时间4,利率5,投资6,贷款月还款计算7,退出8");
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
			System.out.print("请重新输入");
			main(null);
			scanner.close();

		}

	}

	static void benjin() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入预期钱数");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入年利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入存入年限");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			for (int i = 1; i <= C; i++) {
				D = D * (1 + B);
			}
			System.out.println("本金" + String.format("%.4f", (A / D)));
		} catch (InputMismatchException e) {
			benjin();
		}
		main(null);
		scanner.close();
	}

	static void fulili() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入本金");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入年利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入存入年限");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			for (int i = 1; i <= C; i++) {
				D = D * (1 + B);
			}
			System.out.println("复利终值" + String.format("%.4f", (A * D)));
		} catch (InputMismatchException e) {
			fulili();
		}
		main(null);
		scanner.close();
	}

	static void danli() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入本金");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入年利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入存入年限");
			int C = Math.abs(scanner.nextInt());
			double D = 1;
			D = A * B * C;
			System.out.println("单利终值" + (A + D));
		} catch (InputMismatchException e) {
			danli();
		}
		main(null);
		scanner.close();
	}

	static void shijian() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入本金");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入年利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入预期金额");
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

			System.out.println("需" + i + "年");
		} catch (InputMismatchException e) {
			shijian();
		}
		main(null);
		scanner.close();
	}

	static void lilv() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入本金");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入预期金额");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入存入年限");
			double C = Math.abs(scanner.nextDouble());
			double D = 1;
			D = Math.pow(B / A, 1 / C) - 1;
			System.out.println("利率为" + String.format("%.4f", D));
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
			System.out.print("请输入投资额");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入年利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入存入年限");
			int C = Math.abs(scanner.nextInt());
			double D = 0;
			for (int i = 1; i <= C; i++) {
				D = D + A;
				D = D * (1 + B);
			}
			System.out.println("最终获利" + String.format("%.4f", D));
		} catch (InputMismatchException e) {
			touzi();
		}
		main(null);
		scanner.close();
	}

	static void huankuan() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("请输入贷款额");
			double A = Math.abs(scanner.nextDouble());
			System.out.print("请输入贷款利率");
			double B = Math.abs(scanner.nextDouble());
			System.out.print("请输入贷款年限");
			int C = Math.abs(scanner.nextInt());
			double D = 0;
			for (int i = 1; i <= C; i++) {
				D = A * Math.pow(1.0 + B, C);
			}
			double Repayment = D / (C * 12);
			double interest = A * B * C;
			double sum = A + interest;
			double Repayment1 = sum / (C * 12);
			System.out.println("每月需要还款(单利)" + Repayment1);
			System.out.println("每月需要还款(复利)" + String.format("%.4f", Repayment));
		} catch (InputMismatchException e) {
			huankuan();
		}
		main(null);
		scanner.close();
	}

}
