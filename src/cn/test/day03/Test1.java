package cn.test.day03;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String> ();
        Scanner sc = new Scanner (System.in);
        while (sc.hasNext ()) {
            String item = sc.next ();
            if (!item.equals ("-"))
                s.push (item);
            else if (!s.isEmpty ()) System.out.println (s.pop () + " ");
        }
        System.out.println ("("+s.size ()+" left on stack");
    }
}
