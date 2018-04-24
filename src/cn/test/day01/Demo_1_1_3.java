package cn.test.day01;

import java.util.Scanner;

public class Demo_1_1_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		if(i==j && k==j && i==k){
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}

}
