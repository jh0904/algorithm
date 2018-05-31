package cn.test1.day01;

public class Demo_1_1_6 {
	public static void main(String[] args) {
		double t=9.0;
		while (Math.abs(t-9.0/t)>.001){
			t=(9.0/t+t)/2.0;
			System.out.println(t);
		}
		System.out.format("%.5f\n", t);
		/*int sum = 0;  
		for (int i = 1; i < 1000; i *= 2) {
			for (int j = 0; j < 1000; j++) {
				sum++; //这个是次数的自加，而不是i的加，注意审题！！！
			}
			System.out.println(i+"sum--->"+sum);
		}
		System.out.println(sum);*/
	}
}
