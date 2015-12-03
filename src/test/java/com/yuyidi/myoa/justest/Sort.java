package com.yuyidi.myoa.justest;

import org.junit.Test;

/**
 * 
 * @ClassName: com.yuyidi.myoa.justest
 * @Description: 排序算法 java中常用的8大排序算法 排序分类 插入排序 (直接插入排序，希尔排序) 交换排序 (冒泡排序，快速排序)
 *               选择排序 (简单选择排序，堆排序) 归并排序 分配排序(技术排序) 所需辅助空间最多 ：归并排序 所需辅助空间最少： 堆排序
 *               平均速度最快： 快速排序 不稳定：快速排序，希尔排序，堆排序
 * @author yuyidi0630@163.com
 * @date 2015年12月2日 下午6:16:33
 */
public class Sort {
	/**
	 * 
	 * @Title: insertSort
	 * @Description: 基本思想：在要排序的一组数中，假设前面(n-1)[n>=2]个已经
	 *               是排好序的，现在要把第n个数插到前面的有序排序中，使得这n个数也是排好序的 如此反复循环，直到全部排好序
	 * @author yuyidi0630@163.com
	 * @return void
	 */
	@Test
	public void insertSort() {
		int[] a = { 9, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;// 变量j 用来存储数组中的上一个数组下标
			temp = a[i];// 变量temp 的值为当前数组的下标第n+1个值
			// 将数组前一个值赋值给当前下标的值，然后继续通过j--的方式改变数组的下标获取值依次与当前的temp值比较。
			// 如果temp的值大于数组下标值，则跳出当前循环，并将temp值赋值给当前下标
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
