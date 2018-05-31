package cn.test1.day02;

public class Demo_1_2_89 {
    public static void main(String[] args) {
       /* 8.设 a[] 和 b[] 均为长数百万的整型数组。以下代码的作用是什么？有效吗？
        int[] t = a; a = b; b = t;
        解释：这个是最快的方法了，以为它交换的不是具体的数组，而是地址的引用，所以与长度无关。
        */
      /*  9--->修改 BinarySearch（请见 1.1.10.1 节中的二分查找代码），使用 Counter 统计在有查找中被检查的键的总数并在查找全部结束后打印该值。
        提示：在 main() 中创建一个 Counter 对象并将它作为参数传递给 rank()*/
        int[] numArray = { 1, 2, 3, 4, 67, 88, 89, 101, 222, 788, 999 };
        Counter counter = new Counter();
        int index = rank(222, numArray, counter);

        System.out.println("index: " + index + "\ncouter:" + counter.counter);
    }

    public static int rank(int t, int[] array, Counter counter) {

        int lo = 0;
        int hi = array.length - 1;
        int mid = (lo + hi) / 2;

        while (t != array[mid]) {
            counter.counter++;
            if (t < array[mid]) {

                if (hi == mid) {
                    return -1;
                }
                hi = mid;
            } else if (t > array[mid]) {
                if (lo == mid) {
                    return -1;
                }
                lo = mid;
            } else {
                return mid;
            }

            mid = (lo + hi) / 2;
        }

        return mid;
    }
}

class Counter{
    public int counter;
}

