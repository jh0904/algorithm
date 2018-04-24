package cn.test.day01;


public class Matrix {
	
	public static double[][] mult(double[][] a,double[][] b){//矩阵和矩阵之积
		int M=a[0].length;
		int N=a.length;
		int P=b[0].length;
		double[][] arr=new double[N][P];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <P; j++) {
				for (int m = 0; m <M; m++) {
					arr[i][j]+=a[i][m]*b[m][j];
				}
			}
		}
		return arr;
	}
	public static  double[][] transpose(double[][] a){//矩阵的转置
		int h=a.length;
		int l=a[0].length;
		double[][] b=new double[l][h];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
	public static double[] mult(double[] y,double[][] x){//向量和矩阵之积
		int l=x[0].length;
		double[] b=new double[l];
			for (int j = 0; j < b.length; j++) {
				for (int i = 0; i < x.length; i++) {
					//System.out.println("y--->"+y[i]+"-------"+x[i][j]);
					b[j]+=(y[i]*x[i][j]);
				}
		}
		return b;
	}
	public static double[] mult(double[][] x,double[] y){//矩阵向量之积
		int l=x[0].length;
		double[] b=new double[l];
			for (int j = 0; j < b.length; j++) {
				for (int i = 0; i < x.length; i++) {
					System.out.println("y--->"+y[i]+"-------"+x[i][j]);
					b[j]+=(y[i]*x[i][j]);
				}
		}
		return b;
	}
	public static void main(String[] args) {
		double[] a={1,2,3};
		double[][] x={{1,0,1},{2,1,1},{3,2,2}};
		double[] mult = mult(a, x);
		for (double d : mult) {
			System.out.print(d+" ");
		}
	}
}
