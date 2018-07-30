package cn.test1.itcast;

import java.util.Random;

/**
 * cn.test1.itcast
 *
 * @author jh
 * @date 2018/7/30 15:04
 * description:0-99，一百个整数，随机排列
 * 其中任意一个替换成0-99的一个数
 * 找出重复元素。
 */
public class Demo3 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		Demo2.show (arr);
		System.out.println ("----------------");
		//随机排列
		Random random = new Random ();
		for (int x = 0; x < 1000; x++) {
			int i = random.nextInt (100);
			int j = random.nextInt (100);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		int i = random.nextInt (100);
		int j = random.nextInt (100);
		while (i == j) {
			i = random.nextInt (100);
			j = random.nextInt (100);
		}
		arr[i] = arr[j];
		Demo2.show (arr);
		System.out.println ("----------------");

		System.out.println ("------重复的是------------------->" + arr[i]);

		//方式一
		/*jh:for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				if(arr[x]==arr[y]){
					System.out.println ("重复的是------------------->"+arr[i]);
					break jh;
				}
			}
		}*/

		//方式2 空间换时间

		int[] newArray = new int[100];

		for (int x = 0; x < arr.length; x++) {
			newArray[arr[x]]++;
			if (newArray[arr[x]] == 2) {
				System.out.println ("这个重复的元素是" + arr[x]);
				break;
			}
		}

	}
}
