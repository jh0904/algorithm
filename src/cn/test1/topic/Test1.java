package cn.test1.topic;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/13 19:32
 * description:
 */
class Test1 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 1023; i++) {
			count &= i;
		}
		System.out.println (count);
	}
}
