package com.pl.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description:字节流的输入输出
 * @author: 彭立
 * @date: 2018年9月4日 下午1:36:17
 * 
 */
public class Demo2 {
	/**
	 * 利用字节流读取文件
	 * 
	 * @param filePath
	 */
	public static void input(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		InputStream in = null;
		try {
			// 创建字符流输入对象
			in = new FileInputStream(file);
			// 读取字节直到文本的末尾，如果到了文本的末尾in.read()会返回-1
			// 定义一个长度为1024的字节数组，相当于每次in.read()的时候都会读取1024个字节到我们定义的这个字节数组缓冲区中
			// 在最后一次in.read()出来可能不够1024个字节，这时候是读取实际的字节数到字节数组缓冲区中
			byte[] array = new byte[1024];// 一般我们设置这个缓冲区为1024
			// 读取字节到字节数组缓冲区中，如果到了文本的末尾reader.read()会返回-1
			int num = -1;
			long start = System.currentTimeMillis();
			while ((num = in.read(array)) != -1) {// reader.read(array)返回实际读取到的字节数
				// String str=new
				// String(array);//这种是错误的读取方法，因为在最后一次读取字节的时候，实际读取到的字节数有可能小于字节数组缓冲区的长度
				String str = new String(array, 0, num);// 这种是正确的读取方法，每次根据实际读取到的字节数来转化为字节串
				System.out.print(str);// 这里的打印输出其实并没有太大的意义，而且由于编码方式的不同非常有可能打印出乱码
			}
			long end = System.currentTimeMillis();
			System.out.println("读取时间耗时： " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 利用字节流写入文件
	 * 
	 * @param filePath
	 */
	public static void output(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		OutputStream out = null;
		try {
			// 创建字节流输出对象
			// out = new FileOutputStream(file);//如果只传一个参数，相当于调用new
			// FileWriter(file,false)，即以覆盖的方式去写文件
			out = new FileOutputStream(file, true);// 以追加的方式去写文件
			// 把内容写入到缓冲区
			String str = "hello world" + System.lineSeparator();
			// str = "你好";
			byte[] array = str.getBytes();// 将字符串转换为字节数组
			// System.out.println(array.length);
			long start = System.currentTimeMillis();
			out.write(array, 0, array.length);// 第一个参数是字节数组，第二个参数是从哪个字节开始写入，第三个参数是写入的字节个数（注意不要超限）
			// 把缓冲区的内容更新到文件中
			// 养成习惯每writer.writer()一小段就显式地调用writer.flush()一下
			out.flush();
			long end = System.currentTimeMillis();
			System.out.println("写入时间耗时： " + (end - start));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();// 关闭的同时，会把缓冲区的内容更新到文件中，相当于关闭之前先writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void copyFile(String srcPath, String destPath) {
		long start = System.currentTimeMillis();
		File src = new File(srcPath);
		File dest = new File(destPath);
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int flag = -1;
			while ((flag = in.read(buffer)) != -1) {
				out.write(buffer, 0, flag);
				out.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("文件拷贝耗时： " + (System.currentTimeMillis() - start) + "毫秒");
	}

	public static void main(String[] args) {
		// output("src/main/java/com/pl/demo2/demo2.txt");
		// input("src/main/java/com/pl/demo2/demo2.txt");
		copyFile("src/main/java/com/pl/demo2/待复制图片.jpg", "src/main/java/com/pl/demo2/图片.jpg");
	}
}
