package calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class record {

	static void printrecord() {
		File file = new File("E:\\JAVA1\\calculator\\invest.txt");
		BufferedReader reader = null;
		try {
			// System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("第 " + line + "次投资" + tempString);
				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}

	}

	static void writerecord(double a, double b, int c, double fruit1) {
		String fileName = "E:\\JAVA1\\calculator\\invest.txt";
		String content = connent(a, b, c, fruit1);
		appendMethodB(fileName, content, true);
		printrecord();
	}

	static String connent(double a, double b, int c, double fruit1) {

		String content1 = String.valueOf(a);
		String content2 = String.valueOf(b);
		String content3 = String.valueOf(c);
		String content4 = String.valueOf(fruit1);
		return content1 + "元,利率为" + content2 + ",存入" + content3 + "年,获利"
				+ content4 + "元\n";
	}

	static void appendMethodB(String fileName, String content, boolean change) {
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			FileWriter writer = new FileWriter(fileName, change);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
