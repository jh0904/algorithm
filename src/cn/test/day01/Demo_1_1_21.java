package cn.test.day01;

import cn.demo.basis.StdOut;
import cn.demo.basis1.StdIn;

public class Demo_1_1_21 {
	public static void main(String[] args) {
	    int M = 3;
	    int index = 0;
	    String[] strs = new String[M];
	    while (index < M)
	        strs[index++] = StdIn.readLine();
	    for (int i = 0; i < strs.length; ++i) {
	        String[] arr = strs[i].split("\\s+");//制表符
	        /*\\s表示   空格,回车,换行等空白符,    
	        +号表示一个或多个的意思,所以...*/
	        double temp = Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]);
	        StdOut.printf("%-10s   %-10s   %-10s   %-13.3f\n", arr[0], arr[1], arr[2], temp);
	    }
	}
}
