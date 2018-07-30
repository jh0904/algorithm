package cn.test1.itcast;

import java.util.Random;

/**
 * cn.test1.itcast
 *
 * @author jh
 * @date 2018/7/30 14:13
 * description:找出数组中重复值找出
 */
public class Demo2 {
	public static void main(String[] args) {
		int[] ints = new int[101];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i;
		}

		ints[100] = 88;

		show (ints);
		Random random = new Random ();
		for (int x = 0; x < 1000; x++) {
			int i = random.nextInt (101);
			int j = random.nextInt (101);
			int temp = ints[i];
			ints[i] = ints[j];
			ints[j] = temp;
		}
		show (ints);

	}

	public static void show(int[] ints) {
		System.out.println ();
		for (int anInt : ints) {
			System.out.print (anInt + "\t");
		}
	}

}
