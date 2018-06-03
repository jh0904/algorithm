package cn.test1.sort;

/**
 * BubbleSort
 *
 * @author jh
 * @date 2018/6/3
 * 冒泡排序顾名思义就是整个排序的过程就像气泡一样往上冒。单向冒泡排序的思想是：对于给定的n个记录，从第一个记录开始依次对相邻的两个
 * 记录作比较，当前面的大于后面的值时，交换位置。进行一轮比较和换位后，n个记录中的最大记录将位于第n位;然后对前(n-1)个记录进行第
 * 二轮比较;重复该过程直到进行比较的记录只剩下一个为止。
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int i, j;
        int len = arr.length;
        //第一次遍历，取
        // 出所有的值
        for (i = 0; i < len - 1; i++) {
            //每一次的排序结果展示
            System.out.print ("第" + (i) + "次-->  ");
            for (int i1 : arr) {
                System.out.print (i1 + " ");
            }
            System.out.println ();
            //第二次遍历交换值，但是 j <len-1-i 后面的少遍历一次已经排在后面的集合
            for (j = 0; j < len - 1 - i; j++) {
                //比较当前位置与后面位置的大小。如果大，两个交换位置。即把大的数据往后排。
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {36, 22, 48, 12, 25, 65, 43, 57};
        bubbleSort (arr);
        System.out.print ("结果--->  ");
        for (int i : arr) {
            System.out.print (i + " ");
        }
    }
}
