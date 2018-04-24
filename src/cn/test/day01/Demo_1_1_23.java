package cn.test.day01;

import java.util.Arrays;

import cn.demo.basis.StdOut;
import cn.demo.basis1.StdIn;

public class Demo_1_1_23 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //这里参数symbol本来是要传进来的，这里写死，是为了Demo方便
        char symbol = '+';
        int[] whitelist = {1,2,3,4,5,6,7,11,222};
        Arrays.sort(whitelist);//对数组进行排序
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int found = rank(key, whitelist);
            if ('+' == symbol && found == -1)//当符号为+时，且没有找到搜索对象搜索的值
                StdOut.println(key);
            if ('-' == symbol && found != -1)//当符号为-时，搜索到对象，打印出来搜索的值
                StdOut.println(key);
        }
    }
}
