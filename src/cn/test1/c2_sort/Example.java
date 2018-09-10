package cn.test1.c2_sort;

import java.util.Scanner;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/10 8:08
 * description:创建排序类的模板
 */

public class Example {
	public static class Insertion {
		public static void sort(Comparable[] a) {
			int N = a.length;
			for (int i = 0; i < N; i++) {
				//将a[i]插入到a[i-1]、a[i-1]、a[i-3]...中
				for (int j = i; j > 0 && less (a[j], a[j - 1]); j--) {
					exch (a, j, j - 1);
				}
			}
		}
	}

	public static class Selection {
		/*
		 * 选择排序，就是先找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置。再次，在剩下的元素中找最小的元素，与第二个交换位置。
		 * */
		public static void sort(Comparable[] a) {
			int N = a.length;
			for (int i = 0; i < N; i++) {
				int min = i;
				for (int j = i + 1; j < N; j++) {
					if (less (a[j], a[min])) {
						min = j;
					}
				}
				exch (a, i, min);
			}
		}
	}

	private static void sort(Comparable[] a) {
		//Selection.sort (a);
		Insertion.sort (a);
	}

	/*
	 * less（）进行元素比较
	 * */
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo (w) < 0;
	}

	/*
	 *实现元素位置
	 * */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print (a[i] + " ");
		}
		System.out.println ();
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			if (less (a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * 测试用例：
		 S O R T E X A M P L E
		 * */
		Scanner sc = new Scanner (System.in);
		String next = sc.nextLine ();
		String[] s = next.split (" ");
		sort (s);
		assert isSorted (s);
		show (s);
	}
}
