package cn.test.day01;

import java.util.Scanner;

public class Demo_1_1_26 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int t=0;
			if(a>b){t=a;a=b; b=t;}//a<--->b
			if(a>c){t=a;a=c; c=t;}//a<--->c
			if(b>c){t=b;b=c; b=t;}//b<--->c
			System.out.println(a+" "+b+" "+c);
		}
}
