package com.pl.demo1;

/**
 * @author: 彭立
 * @date: 2018年8月27日 下午10:02:15
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		// 假设有一个数组中存储多个乱序排列的数
		int[] arry = { 23, 1, 32, 7, 13, 41, 6, 81, 63, 75, 96, 7 };
		sort(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}

	// 排序算法
	private static void sort(int[] arry) {
		for (int i = 0; i < arry.length - 1; i++) {// 假设有n个乱序排列的数，则需要进行n-1轮对比
			for (int j = 0; j < arry.length - (i + 1); j++) {// 第1轮对比则需要进行n-1次两两对比，第2轮对比则需要进行n-2次两两对比，以此类推
				if (arry[j] < arry[j + 1]) {
					int temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
				}
			}
		}

	}

}
