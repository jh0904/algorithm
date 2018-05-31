package cn.test1.day03;

import java.util.Scanner;

public class Queue<Item> {//先来先服务
    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node ();
        last.item = item;
        last.next = null;
        if (isEmpty ()) first = last;
        else oldlast.next = last;
        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty ()) last = null;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<String> ();
        Scanner sc = new Scanner (System.in);
        while (sc.hasNext ()) {
            String item = sc.next ();
            if (!item.equals ("-"))
                q.enqueue (item);
            else if (!q.isEmpty ()) System.out.println (q.dequeue () + " ");
        }
    }
}
