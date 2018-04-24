package cn.test.day01;

/***
 * 1.1.20 编写一个递归的静态方法计算 ln(N!) 的值。
 * 
 * 
 */
public class Demo_1_1_20_1 {

	/*****************方法一************************/
	//运用f(3) = ln(3!) = ln3 + ln2 + ln1 = f(2) + ln3
	public static double logarithmic1(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 0;
		return (logarithmic1(N - 1)  + Math.log(N));
	}
	
	/**********************方法二**************************/
	
	public static long factorial(int M) {
        if(0 == M || 1 == M)
            return 1;
        else
            return M * factorial(M - 1);
    }

    public static double logarithmic2(int N) {
        return Math.log(factorial(N));
    }
    
    /*************************************************/
    //f(3) = ln(3!) = ln(3 * 2 * 1)
	public static void main(String[] args) {
		double result1 = logarithmic1(2);
		System.out.println(result1);
		
		double result2 = logarithmic2(1);
		System.out.println(result2);

	}
}
