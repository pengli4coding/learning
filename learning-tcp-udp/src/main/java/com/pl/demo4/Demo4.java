package com.pl.demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:demo4主要学习TCP
 * @author: 彭立
 * @date: 2018年9月8日 下午9:11:23
 * 
 */
public class Demo4 {

	public static void startServer(int port) {
		ServerSocket servetSocket = null;
		Socket socket = null;
		BufferedReader reader = null;
		try {
			System.out.println("服务器端启动");
			// 创建服务器端的套接字（socket）
			servetSocket = new ServerSocket(port);
			// 监听端口并等待连接请求（返回真正的服务器端通信套接字socket）
			socket = servetSocket.accept();
			// 获得通道的输入输出流对象（字节流）
			InputStream in = socket.getInputStream();
			// OutputStream out = socket.getOutputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			// 获得输入流内容
			String content = reader.readLine();
			// 获得客户端的ip和主机名的信息
			InetAddress inetAddress = socket.getInetAddress();
			System.out.println("收到了来自" + inetAddress + "的信息： " + content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (socket != null) {
					socket.close();
				}
				if (servetSocket != null) {
					servetSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void startClient(String ip, int port) {
		Socket socket = null;
		BufferedWriter writer = null;
		try {
			// 创建客户端通信套接字socket
			socket = new Socket(ip, port);
			// 获得通道的输出流对象（字节流）
			// InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(out));
			// 往输出流中写入内容
			String content = "hello,server";
			writer.write(content);
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
