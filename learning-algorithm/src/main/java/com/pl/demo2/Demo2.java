package com.pl.demo2;

/**
 * @Description:二分法的代码
 * @author: 彭立
 * @date: 2018年8月29日 上午10:37:56
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 6, 9, 12, 34, 122, 541, 999 };
		System.out.println(new Demo2().getIndex(array, 0, array.length - 1, 122));
	}

	public int getIndex(int[] array, int start, int end, int num) {
		if (end == start && array[end] == num) {
			return end;
		}
		if (end == start && array[end] != num) {
			return -1;
		}
		if ((end - start + 1) % 2 == 0) {// 数组长度为偶数的时候
			if (array[(end - start) / 2] == num) {
				return (end - start) / 2;
			} else if (array[(end - start) / 2] > num) {
				return getIndex(array, start, (end - start) / 2, num);
			} else {
				return getIndex(array, (end - start) / 2 + 1, end, num);
			}
		} else {// 数组长度为奇数的时候
			if (array[(end - start) / 2] == num) {
				return (end - start) / 2;
			} else if (array[(end - start) / 2] > num) {
				return getIndex(array, start, (end - start) / 2, num);
			} else {
				return getIndex(array, (end - start) / 2 + 1, end, num);
			}
		}
	}
	
	//复制数组
	private int[] copyArray(int[] array, int start, int end) {
		int length = end - start + 1;
		int[] resultArray=new int[length];
		for(int i=0;i<length;i++) {
			resultArray[i]=array[start+i];
		}
		StringBuffer sb=new StringBuffer();
		StringBuilder sb1=new StringBuilder();
		
		return resultArray;
	}
}
