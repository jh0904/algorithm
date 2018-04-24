package cn.test.day01;

/*
 * 用一个递归的静态方法，计算ln(N!);
 * 
 */
public class Demo_1_1_20 {
	public static void main(String[] args) {
		int factorial = factorial(2);
		double log = Math.log(factorial);
		System.out.println(log);
	}
	//阶乘
	public static int factorial(int n){
		int i=1;
		for (int j = 2; j <=n; j++) {
			i*=j;
		}
		return i;
	}
}
