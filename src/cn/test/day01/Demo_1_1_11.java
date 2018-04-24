package cn.test.day01;

import java.util.Scanner;

public class Demo_1_1_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str = Integer.toBinaryString(n);
		System.out.println(str);
	}
}
