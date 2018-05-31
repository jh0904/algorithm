package cn.test1.day01;

public class Sqrt {//计算平方根，利用牛顿迭代法。
	public static void main(String[] args) {
		double sqrt = sqrt(2);
		System.out.println(sqrt);
	}
	public static double sqrt(double c){
		if(c<0) return Double.NaN;
		double err=1e-15;
		double t=c;
		while (Math.abs(t-c/t)>err*c) 
			t=(c/t+t)/2.0;
		return t;
	}
}
