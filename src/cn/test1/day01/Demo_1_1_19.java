package cn.test1.day01;

/*
 * 斐波那契数列，递归的一个反例。应重新写方法
 * 
 */
public class Demo_1_1_19 {
	   /* public static long F(int N) {
	        if (N == 0)
	            return 0;
	        if (N == 1)
	            return 1;
	        return F(N - 1) + F(N - 2);
	    }

	    public static void main(String[] args) {
	        for (int N = 0; N < 100; N++)
	            StdOut.println(N + " " + F(N));
	    }*/
	public static long F1(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long f = 0;
        long g = 1;
        for (int i = 0; i <N ; i++) {
        	long temp=f;
            f = f + g;
            g = temp;
            
        }
        return f;
    }
    
    static public int f(int n) {
        // write code here
        int f0 = 1;
        int f1 = 1;
        int f2 = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        for(int i = 2; i < n; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
	
    public static void main(String[] args) { 
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + f(N));
    }
}
