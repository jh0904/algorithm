package cn.test1.c2_sort;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/12 20:22
 * description:实现1/1+1/2+1/3+...+1/20
 */
public class Demo1 {
	public static void main(String[] args) {
		double sum=0;
		for (int i = 1; i <= 20; i++) {
			sum+=(Math.pow (i,-1));
		}
		System.out.println (sum);
	}
}
