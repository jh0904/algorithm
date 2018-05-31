package cn.test1.day01;


public class Demo_1_1_9 {
	public static void main(String[] args) {
		char[][] arr={{' ','*','*'},{' ','*',' '},{'*',' ','*'}}; 
		for (int i = 0; i < 3; i++) {
			System.out.print("\t"+i+"\t");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i);
			for (int j = 0; j < arr.length; j++) {
				System.out.print("\t"+arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
