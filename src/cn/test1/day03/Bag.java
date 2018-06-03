package cn.test1.day03;

import java.util.Iterator;
import java.util.ListIterator;

public class Bag {
    private Node first;
    private class Node{
        String item;
        Node next;
    }
    public void add(String item){
        Node oldfirst =first;
        first=new Node ();
        first.item=item;
        first.next=oldfirst;
    }
    public Iterable<String> iterable(){
        return new ListIterator ();
    }
    private class ListIterator implements Iterable<String>{
        private Node current=first;
        public boolean hasNext(){
            return current!=null;
        }
        public void remove(){}
        public String next(){
            String item = current.item;
            current=current.next;
            return item;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }
    }
}
