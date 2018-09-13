package cn.test1.c2_sort;

/**
 * cn.test1.c2_sort
 *
 * @author jh
 * @date 2018/9/13 9:38
 * description:实现二维数组的斜输出
 */
public class Demo2 {
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int m=arr.length;
		int n=arr[0].length;
		for (int i=0;i<2*m;i++){
			for (int j=0;j<m;j++){
				if ((i-j)>=0 && (i-j)<n){
					System.out.print(arr[j][i-j]+" ");
				}
			}
			//System.out.println();
		}
	}
}
