package cn.test1.sort;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/3 10:58
 * description:插入排序基本思想
 *  将n个元素的数列分为已有序和无序两个部分，如插入排序过程示例下所示： 　　
 *  {{a1}，{a2，a3，a4，…，an}} 　　
 *  {{a1⑴，a2⑴}，{a3⑴，a4⑴ …，an⑴}} 　
 *  {{a1(n-1），a2(n-1) ，…},{an(n-1)}} 　　
 *  每次处理就是将无序数列的第一个元素与有序数列的元素从后往前逐个进行比较，
 *  找出插入位置，将该元素插入到有序数列的合适位置中。
 */
public class InsertSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            System.out.print ("第" + (i) + "次-->  ");
            for (int i1 : arr) {
                System.out.print (i1 + " ");
            }
            System.out.println ();

            //前面的是一个有序集合，后面的是无序集合，每次从无序往有序添加一个元素，然后在判断与前面元素的大小，并且j--，遍历完前面的有序集合。
            for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
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
