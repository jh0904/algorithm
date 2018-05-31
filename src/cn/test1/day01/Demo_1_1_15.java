package cn.test1.day01;

public class Demo_1_1_15 {
	/*
	 * 写一个静态方法histogram(),传入一个整型m和一个int[] arr，返回一个m长度的数组，M[i]的值即为i在参数中出现的次数。
	 */
	public static int[] histogram(int[] arr,int m){
		int[] arr1=new int[m];
		for (int i = 0; i <arr1.length; i++) {
			int count=0;
			System.out.println("i---------->"+i);
			for (int j = 0; j < arr.length; j++) {
				if(i==arr[j]){
					count++;
				}
			}
			arr1[i]=count;
		}
		
		return arr1;
	}
	public static void main(String[] args) {
		int[] a={0,1,2,3,4};
		int[] histogram = histogram(a, 5);
		for (int i : histogram) {
			System.out.print(i);
		}
	}
}
