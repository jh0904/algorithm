package cn.test1.topic;

/**
 * cn.test1.topic
 *
 * @author jh
 * @date 2018/9/15 8:49
 * description:关于String的比较题
 */
public class CVTEDemo {
	public static void main(String[] args) {
		/*String helloworld="hello world";
		String hello="hello";
		System.out.println (helloworld == "hello" + " world");
		System.out.println (helloworld == hello + " world");
		System.out.println (helloworld.intern () == (hello + " world").intern ());*/
			Byte a = 127;
			Byte b = 127;
			add(++a);
			System.out.print(a + " ");
			add(b);
			System.out.print(b + "");
	}
	public static void add(Byte b)
	{
		b = b++;
	}
}
