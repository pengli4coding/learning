package com.pl.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:服务端
 * @author: 彭立
 * @date: 2018年8月26日 下午7:02:43
 * 
 */
public class Server {
	public static void main(String[] args) {
		int port = genPort(args);

		ServerSocket server = null;

		try {
			server = new ServerSocket(port);
			System.out.println("server started!");
			while (true) {
				Socket socket = server.accept();//监听连接，如果没有连接进来，则该方法会一直阻塞
				new Thread(new Handler(socket)).start();//运行到这一步，说明有连接进来了，此时会创建一个新的线程处理连接
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			server = null;
		}
	}

	static class Handler implements Runnable {
		Socket socket = null;

		public Handler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			BufferedReader reader = null;
			PrintWriter writer = null;

			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));//获取输入流
				writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));//获取输出流
				String readMessage = null;
				while (true) {
					System.out.println("server reading...");
					//获取客户端的信息并打印出来
					if ((readMessage = reader.readLine()) == null) {
						break;
					}
					System.out.println(readMessage);
					//往客户端写信息
					writer.println("server recive: " + readMessage);
					writer.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				socket = null;
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				reader = null;
				if (writer != null) {
					writer.close();
				}
				writer = null;
			}

		}

	}
	
	//生成端口号，如果有传入端口号则用传入的，如果没有传入则用默认的9999
	private static int genPort(String[] args) {
		if (args.length > 0) {
			try {
				return Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				return 9999;
			}
		} else {
			return 9999;
		}
	}
}
