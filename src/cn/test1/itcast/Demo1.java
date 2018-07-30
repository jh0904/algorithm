package cn.test1.itcast;

/**
 * cn.test1.itcast
 *
 * @author jh
 * @date 2018/7/30 13:57
 * description:
 */
public class Demo1 {
	public static void main(String[] args) {
		long l = System.nanoTime ();
		//一个数据A对B异或两次，还是本身
		System.out.println (3 ^ 4 ^ 4);

		long l1 = System.nanoTime ();
		System.out.println (l1 - l);
	}
}
