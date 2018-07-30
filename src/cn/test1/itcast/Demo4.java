package cn.test1.itcast;

/**
 * cn.test1.itcast
 *
 * @author jh
 * @date 2018/7/30 15:40
 * description:
 */
public class Demo4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		/*//采用第三方变量。
		int temp=a;
		a=b;
		b=temp;*/

		//方式二，异或运算符
		/*a=a^b;//a=a^b
		b=a^b;//b=(a^b)^b=a
		a=a^b;//a=(a^b)^a=b*/

		//方式三
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println (a + "      " + b);
	}
}
