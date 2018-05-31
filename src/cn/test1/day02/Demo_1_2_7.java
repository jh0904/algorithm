package cn.test1.day02;

public class Demo_1_2_7 {
    //以下递归函数的返回值是什么？
    public static void main(String[] args) {
        String hello = mystery ("hello");
        System.out.println (hello);
        //可以用StringBuffer自带的反转功能实现。
        StringBuffer s=new StringBuffer("hello");
        StringBuffer reverse = s.reverse ();
        System.out.println (reverse);
    }
    public static String mystery(String s)
    {
        int N = s.length(); //获取字符串长度
        if (N <= 1) return s; //如果长度小于等于1，直接返回
        String a = s.substring(0, N/2); //折半分值，直到长度为1的时候输出。
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a); //交换位置
    }
}
