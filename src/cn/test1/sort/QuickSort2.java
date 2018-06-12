package cn.test1.sort;

import java.util.Arrays;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/12 14:22
 * description:
 */
public class QuickSort2 {   //替换数组arr中i位置和j位置的数 。
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int[] arr, int start, int end) {
        //当end大于start进入。
        if (start < end) {
            //把数组第一个值，赋值给key，作为判断位。
            int key = arr[start];
            //把start给i指针
            int i = start;
            //把end给j指针
            int j = end + 1;
            while (true) {
                //这个只要是移动i指针移动的，当i大于key的值时候，退出循环。
                while (i < end && arr[++i] < key) {
                } ;
                //移动j指针移动的，当j小于key的值时候，退出循环。
                while (j > start && arr[--j] > key) {
                };
                //判断i,j大小，j>i时候交换两个位置。
                if (i < j) {
                    swap (arr, i, j);
                } else {
                    break;
                }
            }
            //交换完成之后，和中间值j进行交换，此时右边大于key，左边下于key。
            swap (arr, start, j);
            //在进行递归，知道i<=j，循环退出。
            sort (arr, start, j - 1);
            sort (arr, j + 1, end);

        }
    }

    public static void quicksort(int[] arr) {
        sort (arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {38, 65, 97, 76, 13, 27, 49};

        System.out.println ("排序前：------->" + Arrays.toString (arr));
        quicksort (arr);
        System.out.println ("排序后：------->" + Arrays.toString (arr));

    }

}
