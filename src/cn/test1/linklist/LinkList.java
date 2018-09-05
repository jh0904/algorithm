package cn.test1.linklist;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.LinkedList;

/**
 * cn.test1.linklist
 *
 * @author jh
 * @date 2018/9/5 17:01
 * description:实现一个简单的链表
 */

public class LinkList {
	class Node{
		Node next=null;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head=null;
	//链表头节点的引用

	/**
	 * 给链表中插入数据
	 * */
	public void adddNode(int d){
		Node newNode = new Node (d);
		if (head == null) {
			head=newNode;
			return;
		}
		Node tmp = this.head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}

		//add node to end
		tmp.next=newNode;
	}
	/**
	 * 删除指定位置元素
	 * */

	public boolean deleteNode(int index){
		if(index<1||index>length()){
			return false;
		}

		//删除第一个元素
		if(index==1){
			head=head.next;
			return true;
		}
		//删除的是中间元素
		int i=2;
		//当前节点的前一个节点
		Node preNode = this.head;
		//要删除的节点。
		Node curNode = preNode.next;
		while (curNode!=null){
			if(i==index){
				//删除的方式就是跳过当前节点，用上一个节点的next直接指向删除节点的next
				preNode.next=curNode.next;
				return true;
			}
			preNode=curNode;
			curNode= curNode.next;
			i++;
		}
		return true;
	}

	/**
	 * 返回节点长度
	 * */
	public int length(){
		int length=0;
		Node tmp = this.head;
		while (tmp!=null){
			length++;
			tmp=tmp.next;
		}
		return length;
	}
	/**
	 * 对链表进行排序
	 * */

	/**
	 * 打印链表
	 * */
	public void printList(){
		Node tmp = this.head;
		while (tmp!=null){
			System.out.println (tmp.data);
			tmp=tmp.next;
		}
	}

	public static void main(String[] args) {
		LinkList linkList = new LinkList ();
		linkList.adddNode (3);
		linkList.adddNode (1);
		linkList.adddNode (5);
		linkList.adddNode (3);
		linkList.deleteNode (1);
		System.out.println ("length---->" + linkList.length ());
		linkList.printList ();

	}

}
