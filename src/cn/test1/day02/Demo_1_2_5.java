package cn.test1.day02;

public class Demo_1_2_5 {
    public static void main(String[] args) {
        String s="hello world";
        s.toUpperCase ();
        s.substring (6,11);
        System.out.println (s);
        /*
            "hello world"。String对象是不可变的--所有字符串方法都会返回一个新的String对象（但他们不会改变参数对象的值）。
            这段代码忽略了返回对象并打印了原字符串。要打印出“WORLD”，请用s=s.toUpperCase(),s=s.substring(6,11)。
        */
    }
}
