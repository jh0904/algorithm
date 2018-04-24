package cn.test.day01;

public class Demo_1_1_22 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int rank = rank(4, a);
		System.out.println(rank);
	}
	public static int rank(int key,int[] a){
		return rank(key,a,0,a.length-1,1);
	}
	public static int rank(int key, int[] a, int lo, int hi,int deep) {
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi。
		for (int i = 0; i <deep; i++)
			System.out.print(" ");
		System.out.println("lo--->"+lo+"   hi--->"+hi);
		if(lo>hi) return -1;
		int mid =lo + (hi-lo)/2;
		if		(key<a[mid]) return rank(key, a, lo, mid-1,deep+1);
		else if (key>a[mid]) return rank(key, a, mid+1, hi,deep+1);
		else 				 return mid;
	}
}
