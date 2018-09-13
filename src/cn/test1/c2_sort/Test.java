package cn.test1.c2_sort;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/13 19:11
 * description:
 */
class A {
	public A() {
		super();
	}

	public String show(D obj) {
		return ("A D");
	}
	/*public String show(C obj) {
		return ("A C");
	}*/
	public String show(A obj) {
		return ("A A");
	}
}

class B extends A {
	public B() {
		super();
	}

	public String show(B obj) {
		return ("B B");
	}
	public String show(A obj) {
		return ("B A");
	}
}

class C extends B {
	public C() {
		super();
	}
}

class D extends B {
	public D() {
		super();
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new B ();
		B b = new B ();
		C c = new C ();
		D d = new D ();
		System.out.println (a.show (c));
		System.out.println (a.show (d));
		System.out.println (b.show (c));
		System.out.println (b.show (d));
	}
}
