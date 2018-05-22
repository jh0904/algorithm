package cn.test.day03;

import java.util.Iterator;
import java.util.Scanner;
//用链表实现下压堆栈
public class Stack<Item> implements Iterable<Item>{
    private Node first; //栈顶（最近添加的元素）
    private int N;      //元素数量
    private class Node{//定义Node内部类
        Item item;
        Node next;
    }
    public boolean isEmpty(){ return first==null; }
    public void push(Item item){  //往栈顶添加元素，就相当于给链表头部添加一个元素
        Node oldfirst=first;
        first=new Node ();
        first.item=item;
        first.next=oldfirst;
        N++;
    }
    public Item pop(){  //栈顶删除元素，把第一个元素的下一个值赋给第一个元素，则为删除
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }
    @Override
    public Iterator iterator() {//暂时不遍历
        return null;
    }

    public static void main(String[] args) {
       Stack<String> s = new Stack<String> ();
        Scanner sc = new Scanner (System.in);
        while (sc.hasNext ()) {
            String item = sc.next ();
            if (!item.equals ("-"))
                s.push (item);
            else if (!s.isEmpty ()) System.out.println (s.pop () + " ");
        }
        //System.out.println ("("+s.size ()+" left on stack");
    }

}
