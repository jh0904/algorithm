package cn.test1.sort;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/3 10:15
 * description:选择排序：给定一组记录，经过第一轮之后得到最小的一个记录，然后将这个记录与第一个记录位置互换；第二轮查找出第二小的记录，
 * 然后在于第二个位置互换。
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        int i, j;
        int temp;
        int flag;
        int n = arr.length;
        for (i = 0; i < n; i++) {

            //每一次的排序结果展示
            System.out.print ("第" + (i) + "次-->  ");
            for (int i1 : arr) {
                System.out.print (i1 + " ");
            }
            System.out.println ();

            //开始交换位置，直接从i+1处开始，因为之前的已经是最小值排好了，不用重新排序。
            //先把第一个位置给temp，然后保存当前flag
            // temp = arr[i];
            //flag = i;
            for (j = i + 1; j < n; j++) {
                //遍历数组，如果有值比当前的temp小，把值赋值给temp，然后把flag = j;，这样的作用是遍历所有元素，查询出最小值给temp。
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //如果最后flag和i不相等，说明还有比arr[i]更小的值，所以把两个交换位置。
           /* if (flag != i) {
                arr[flag] = arr[i];
                arr[i] = temp;
            }*/
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 65, 97, 76, 13, 27, 49};
        selectSort (arr);
        System.out.print ("结果--->  ");
        for (int i : arr) {
            System.out.print (i + " ");
        }
    }
    /*
        第0次-->  38 65 97 76 13 27 49
        第1次-->  13 65 97 76 38 27 49
        第2次-->  13 27 97 76 38 65 49
        第3次-->  13 27 38 76 97 65 49
        第4次-->  13 27 38 49 97 65 76
        第5次-->  13 27 38 49 65 97 76
        第6次-->  13 27 38 49 65 76 97
        结果--->  13 27 38 49 65 76 97
     */
}
