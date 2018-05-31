package cn.test1.day01;

public class Demo_1_1_14 {
	/*
	 * 写一个静态方法lg(),传入一个整型N，返回一个一log2N的函数（不使用其他类）
	 */
	public static int lg(int n){
		int count=0;
		while(n>1){
			count++;
			n=n>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		int lg = lg(8);
		System.out.println(lg);
	}
}
