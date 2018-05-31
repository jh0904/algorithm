package cn.test1.day01;

import java.util.Scanner;

public class Demo_1_1_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		int[][] brr=new int[n][m];
		for (int i = 0; i <m; i++) {
			for (int j = 0; j <n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i <m; i++) {
			for (int j = 0; j <n; j++) {
				brr[j][i]=arr[i][j];
			}
		}
		for (int[] is : brr) {
			for (int i : is) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
