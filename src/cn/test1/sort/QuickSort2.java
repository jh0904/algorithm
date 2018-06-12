package cn.test1.sort;

import java.util.Arrays;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/12 14:22
 * description:
 */
public class QuickSort2 {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int key = arr[start];
            int i = start;
            int j = end + 1;
            while (true) {
                while (i < end && arr[++i] < key) ;

                while (j > start && arr[--j] > key) ;
                if (i < j) {
                    swap (arr, i, j);
                } else {
                    break;
                }
            }
                swap (arr, start, j);

                sort (arr, start, j - 1);
                sort (arr, j + 1, end);

        }
    }

    public static void quicksort(int[] arr) {
        sort (arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 7};

        System.out.println ("排序前：------->" + Arrays.toString (arr));
        quicksort (arr);
        System.out.println ("排序后：------->" + Arrays.toString (arr));

    }

}
