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
			// System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null) {
				// ��ʾ�к�
				System.out.println("�� " + line + "��Ͷ��" + tempString);
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
		return content1 + "Ԫ,����Ϊ" + content2 + ",����" + content3 + "��,����"
				+ content4 + "Ԫ\n";
	}

	static void appendMethodB(String fileName, String content, boolean change) {
		try {
			// ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
			FileWriter writer = new FileWriter(fileName, change);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
