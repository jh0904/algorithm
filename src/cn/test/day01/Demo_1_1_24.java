package cn.test.day01;

public class Demo_1_1_24 {
	/*
	给出使用欧几里得算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。
	扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约
	数并打印出每次调用递归方法时的两个参数。使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
	*/
		public static int gcd(int m,int n) {
			/*算法解释：
			 *在循环中，只要除数不等于0，用较大数除以较小数，将小的数作为下一次的大数，余数作为下一次循环较小的数
			 * 如此循环到较小的数为0时，返回较大的数。此数就是最大公约数。
			 * 最小公倍数为两数之积除以最大公约数
			*/
	        int rem = 0;
	        int M = m;
	        int N = n;
	        if (m < n) {
	            M = n ;
	            N = m ;
	        }
	        rem = M % N ;
	        if (0 == rem)
	            return N;
	        //System.out.println("m:"+ N + ";n:" + rem);
	        return gcd(N, rem);
	    }

	    public static void main (String[] args) {
	        
	        int a =gcd(5 ,  5);
	        System.out.println(a + "");

	}
}
