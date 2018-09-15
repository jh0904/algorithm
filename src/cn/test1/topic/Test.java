package cn.test1.topic;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/13 19:11
 * description:
 */
class A {
	public String show(D obj) {
		return ("A D");
	}
	public String show(A obj) {
		return ("A A");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B B");
	}
	public String show(A obj) {
		return ("B A");
	}
}

class C extends B {
}

class D extends B {
}

public class Test {
	public static void main(String[] args) {
		A a = new B ();
		B b = new B ();
		C c = new C ();
		D d = new D ();
		System.out.println (a.show (c));//aa
		System.out.println (a.show (d));//ad
		System.out.println (b.show (c));//bb
		System.out.println (b.show (d));//bb
	}
}
