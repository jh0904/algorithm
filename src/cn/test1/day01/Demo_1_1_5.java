package cn.test1.day01;

import java.util.Scanner;

public class Demo_1_1_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if(a >= 0.0 && a <= 1.0 && b >= 0.0 && b<=1.0){
			System.out.println("true");
			
		}else{
			System.out.println("false");
		}
}}
