package cn.test.day01;

public class Demo_1_1_27{
    /*使用一个二维数组来存放各项二项分布的概率
    *行代表重复N次试验，列代表发生k次，所以在下面循环条件中需要 j<=i
    */
    public static double[][] binomial(int N,int k,double p){
        double[][] array=new double[N+1][k+1];
        //给二维数组初始化第一列，避免下面执行时出现数组下标越界
        array[0][0]=1.0;
        for(int i=1;i<N+1;i++)
            array[i][0]=array[i-1][0]*(1-p);
        for(int i=1;i<N+1;i++)
            for(int j=1;j<=i && j<k+1;j++)
                array[i][j]=(1-p)*array[i-1][j] + p*array[i-1][j-1];
        return array;
    }
    public static void main(String[] args){
        double[][] array=binomial(100,50,0.25);
        //System.out.println(array[100][50]);
    }
}
