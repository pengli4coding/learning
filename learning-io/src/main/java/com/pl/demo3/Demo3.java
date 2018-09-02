package com.pl.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @Description:字符流的输入输出
 * @author: 彭立
 * @date: 2018年9月2日 下午8:05:27
 * 
 */
public class Demo3 {
	/**
	 * 提取指定的文件中的字符流出来（一个字符一个字符地打印出来，效率较低）
	 * 
	 * @param filePath
	 */
	public static void input(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		Reader reader = null;
		try {
			// 创建字符流输入对象
			reader = new FileReader(file);
			// 读取字符直到文本的末尾，如果到了文本的末尾reader.read()会返回-1
			int num = -1;
			long start = System.currentTimeMillis();
			while ((num = reader.read()) != -1) {// reader.read();返回字符的Unicode编码
				System.out.print((char) num);// 强转为字符char
			}
			long end = System.currentTimeMillis();
			System.out.println("读取时间耗时： " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 提取指定的文件中的字符流出来（读取的字符先存到一个字符数组缓冲区中，效率较高）
	 * 
	 * @param filePath
	 */
	public static void input1(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		Reader reader = null;
		try {
			// 创建字符流输入对象
			reader = new FileReader(file);
			// 读取字符直到文本的末尾，如果到了文本的末尾reader.read()会返回-1
			// 定义一个长度为1024的字符数组，相当于每次reader.read()的时候都会读取1024个字符到我们定义的这个字符数组缓冲区中
			// 在最后一次reader.read()出来可能不够1024个字符，这时候是读取实际的字符数到字符数组缓冲区中
			char[] array = new char[1024];// 一般我们设置这个缓冲区为1024，也就是16kb的内存空间
			// 读取字符到字符数组缓冲区中，如果到了文本的末尾reader.read()会返回-1
			int num = -1;
			long start = System.currentTimeMillis();
			while ((num = reader.read(array)) != -1) {// reader.read(array)返回实际读取到的字符数
				// String str=new
				// String(array);//这种是错误的读取方法，因为在最后一次读取字符的时候，实际读取到的字符数有可能小于字符数组缓冲区的长度
				String str = new String(array, 0, num);// 这种是正确的读取方法，每次根据实际读取到的字符数来转化为字符串
				System.out.print(str);
			}
			long end = System.currentTimeMillis();
			System.out.println("读取时间耗时： " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 往指定的文件中写字符流（直接写入字符串）
	 * 
	 * @param filePath 文件路径
	 */
	public static void output(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		Writer writer = null;
		try {
			// 创建字符流输出对象
			// writer = new FileWriter(file);//如果只传一个参数，相当于调用new
			// FileWriter(file,false)，即以覆盖的方式去写文件
			writer = new FileWriter(file, true);// 以追加的方式去写文件
			// 把内容写入到缓冲区
			writer.write("hello world" + System.lineSeparator());
			// 把缓冲区的内容更新到文件中
			// 这一步是蛮重要的，虽然说不flush的话一时半会缓冲区不会爆，可以在最后writer.close()的时候自动flush，但是这种做法占用资源不说，也会有缓冲区爆的风险
			// 养成习惯每writer.writer()一小段就显式地调用writer.flush()一下
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();// 关闭的同时，会把缓冲区的内容更新到文件中，相当于关闭之前先writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 往指定的文件中写字符流（写入字符数组）
	 * 
	 * @param filePath 文件路径
	 */
	public static void output1(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		Writer writer = null;
		try {
			// 创建字符流输出对象
			// writer = new FileWriter(file);//如果只传一个参数，相当于调用new
			// FileWriter(file,false)，即以覆盖的方式去写文件
			writer = new FileWriter(file, true);// 以追加的方式去写文件
			// 把字符数组写入到缓冲区
			char[] array = { '我', '非', '常', '爱', '编', '程' };
			writer.write(array, 1, 5);// 第一个参数是字符数组，第二个参数是从哪个字符开始写入，第三个参数是写入的字符个数（注意不要超限）
			// 把缓冲区的内容更新到文件中
			// 这一步是蛮重要的，虽然说不flush的话一时半会缓冲区不会爆，可以在最后writer.close()的时候自动flush，但是这种做法占用资源不说，也会有缓冲区爆的风险
			// 养成习惯每writer.writer()一小段就显式地调用writer.flush()一下
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();// 关闭的同时，会把缓冲区的内容更新到文件中，相当于关闭之前先writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 这个例子演示当要输出大量的字符到文本中的时候，应该如何flush刷新
	 * 
	 * @param filePath 文件路径
	 */
	public static void outputFlush(String filePath) {
		// 指定文件路径
		File file = new File(filePath);
		Writer writer = null;
		try {
			// 创建字符流输出对象
			// writer = new FileWriter(file);//如果只传一个参数，相当于调用new
			// FileWriter(file,false)，即以覆盖的方式去写文件
			writer = new FileWriter(file, true);// 以追加的方式去写文件
			// 往文件中写入1000000个hello world
			for (int i = 0; i < 1000000; i++) {
				writer.write("hello world" + System.lineSeparator());
				if (i % 99 == 0) {// 每写99个flush一下
					writer.flush();
				}
			}
			writer.flush();// 最后再来flush一下
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();// 关闭的同时，会把缓冲区的内容更新到文件中，相当于关闭之前先writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 读取某一文件内容并写到另外一个文件中（简单的说就是文件的拷贝）
	 * 
	 * @param sourcePath      源文件
	 * @param destinationPath 目标文件
	 */
	public static void inputAndOutput(String sourcePath, String destinationPath) {

		// 指定文件路径
		File sourceFile = new File(sourcePath);
		File destinationFile = new File(destinationPath);

		Reader reader = null;
		Writer writer = null;
		try {
			// 创建字符流输入对象以及字符流输出对象，从源文件中读取字符到我们给定的字符数组缓冲区中，然后再把字符数组缓冲区的内容写入到目标文件中
			reader = new FileReader(sourceFile);
			writer = new FileWriter(destinationFile);// 以覆盖的方式去写文件

			char[] array = new char[1024];// 字符数组缓冲区
			int num = -1;
			while ((num = reader.read(array)) != -1) {
				writer.write(array, 0, num);
				writer.flush();// flush一下刷到文件中
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
