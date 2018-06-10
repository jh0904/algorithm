package cn.test1.sort;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/10 16:56
 * description:
 * 快速排序：
 * 一趟快速排序的算法是：
 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 * 2）以第一个数组元素作为关键数据，赋值给key，即 key=A[0]；
 * 3）从j开始向前搜索，即由后开始向前搜索（j=j-1即j--），找到第一个小于key的值A[j]，A[i]与A[j]交换；
 * 4）从i开始向后搜索，即由前开始向后搜索（i=i+1即i++），找到第一个大于key的A[i]，A[i]与A[j]交换；
 * 5）重复第3、4、5步，直到 I=J；(3,4步是在程序中没找到时候j=j-1，i=i+1，直至找到为止。找到并交换的时候i， j指针位置不变。另外当i=j这过程一定正好是i+或j-完成的最后令循环结束。）
 */
public class QuickSort {

    public static void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int i, int j) {
        int pivotIndex = (i + j) / 2;
        // swap
        swap(data, pivotIndex, j);

        int k = partition(data, i - 1, j, data[j]);
        swap(data, k, j);
        if ((k - i) > 1)
            quickSort(data, i, k - 1);
        if ((j - k) > 1)
            quickSort(data, k + 1, j);

    }

    /**
     * @param data
     * @param r
     * @param l
     * @return
     */
    private static int partition(int[] data, int l, int r, int pivot) {
        do {
            while (data[++l] < pivot)
                ;
            while ((r != 0) && data[--r] > pivot)
                ;
            swap(data, l, r);
        } while (l < r);
        swap(data, l, r);
        return l;
    }


    public static void swap(int[] data, int i, int j) {  //data数组中i位置和j位置互换
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {38, 65, 97, 76, 13, 27, 49};
        sort (arr);
        System.out.print ("结果--->  ");
        for (int i : arr) {
            System.out.print (i + " ");
        }
    }
}
