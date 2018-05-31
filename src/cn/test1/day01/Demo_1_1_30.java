package cn.test1.day01;

import java.util.Scanner;

public class Demo_1_1_30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean[][] b=new boolean[sc.nextInt()][sc.nextInt()];
		for (int i = 1; i <= b.length; i++) {
			for (int j = 1; j <= b[0].length; j++) {
				int a=gcd(i, j);
				if(a!=1){
					b[i-1][j-1]=true;
				}else{
					b[i-1][j-1]=false;
				}
			}
		}
	for (boolean[] cs : b) {
		for (boolean c : cs) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	}
	public static int gcd(int m,int n) {
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
        return gcd(N, rem);
    }
}
