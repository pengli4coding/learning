package com.pl.demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	/**
	 * 利用BufferedWriter高效缓冲区往指定文件写入字符
	 * 
	 * @param filePath
	 */
	public static void output(String filePath) {

		BufferedWriter bw = null;
		try {
			// BufferedWriter的构造器需要传入Writer参数（典型的装饰器模式，由于Writer类是抽象类，这里需要传入子类FileWriter）
			bw = new BufferedWriter(new FileWriter(filePath));
			bw.write("hello io");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭BufferedWriter流就自动关闭了FileWriter的流
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void read(String filePath) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
			String content = null;
			while ((content = br.readLine()) != null) {
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		//output("src/main/java/com/pl/demo4/demo4.txt");
		read("src/main/java/com/pl/demo4/demo4.txt");
	}
}
