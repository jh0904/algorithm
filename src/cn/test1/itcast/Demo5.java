package cn.test1.itcast;

import java.util.HashMap;

/**
 * cn.test1.itcast
 *
 * @author jh
 * @date 2018/7/30 15:55
 * description:递归实现斐波那契数列
 * 1,1,2,3,5,8,13,21
 */
public class Demo5 {
	private static int count = 0;

	public static void main(String[] args) {

		int num = getNum2(30);
		System.out.println ("30------------>" + num);
		System.out.println ("调用次数------>" + count);

	}

	//递归方式
	public static int getNum(int m) {
		count++;
		if (m == 1 || m == 2) {
			return 1;
		}
		return getNum (m - 1) + getNum (m - 2);
	}

	//备忘录算法
	private static HashMap<Integer, Integer> hm = new HashMap<> ();

	public static int getNum1(int m) {
		count++;
		if (m == 1 || m == 2) {
			return 1;
		}
		if (hm.containsKey (m)) {
			return hm.get (m);
		} else {
			int value = getNum1 (m - 1) + getNum1 (m - 2);
			hm.put (m, value);
			return value;
		}
	}

	//动态规划
	public static int getNum2(int m) {
		count++;
		if (m == 1 || m == 2) {
			return 1;
		}
		int a=1;
		int b=1;
		int temp=0;
		for (int i = 3; i <= m; i++) {
			temp= a + b;
			a=b;
			b=temp;
		}
		return  temp;
	}

}
