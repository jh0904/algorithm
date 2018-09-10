package cn.test1.linklist;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;

/**
 * cn.test1.linklist
 *
 * @author jh
 * @date 2018/9/5 17:01
 * description:实现一个简单的链表
 */

public class LinkList {
	class Node {
		Node next = null;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	//链表头节点的引用

	/**
	 * 给链表中插入数据
	 */
	public void adddNode(int d) {
		Node newNode = new Node (d);
		if (head == null) {
			head = newNode;
			return;
		}
		Node tmp = this.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		//add node to end
		tmp.next = newNode;
	}

	/**
	 * 删除指定位置元素
	 */

	public boolean deleteNode(int index) {
		if (index < 1 || index > length ()) {
			return false;
		}

		//删除第一个元素
		if (index == 1) {
			head = head.next;
			return true;
		}
		//删除的是中间元素
		int i = 2;
		//当前节点的前一个节点
		Node preNode = this.head;
		//要删除的节点。
		Node curNode = preNode.next;
		while (curNode != null) {
			if (i == index) {
				//删除的方式就是跳过当前节点，用上一个节点的next直接指向删除节点的next
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return true;
	}

	/**
	 * 返回节点长度
	 */
	public int length() {
		int length = 0;
		Node tmp = this.head;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}
	/**
	 * 对链表进行排序
	 * */

	/**
	 * 打印链表
	 */
	public void printList() {
		Node tmp = this.head;
		while (tmp != null) {
			System.out.println (tmp.data);
			tmp = tmp.next;
		}
	}

	/**
	 * 删除链表重复元素
	 */
	public void deleteDuplecate(Node head) {
		HashMap<Integer, Integer> map = new HashMap<> ();
		Node tmp = head;
		Node pre = null;
		while (tmp != null) {
			if (map.containsKey (tmp.data)) {
				pre.next = tmp.next;
			} else {
				map.put (tmp.data, 1);
				pre = tmp;
			}
			tmp = tmp.next;
		}
	}

	public void deleteDuplecate1(Node head) {
		/*
		采用双层循环遍历，外循环正常遍历链表，假设外循环当前结点为cur，内循环就从cur开始遍历，若碰到与cur所指结点相同的值，则删除这个重复结点。
		 */
		Node p = head;
		while (p != null) {
			Node q = p;
			while (q.next != null) {
				//若当前值与下一个值的data相等
				if (p.data == q.next.data) {
					//跳过下一次的值
					q.next = q.next.next;
				} else {
					//不相等继续向下遍历
					q = q.next;
				}
			}
			p = p.next;
		}
	}

	/**
	 * 查找链表中倒数第K个元素
	 * 思想：就是说两个指针，第一个从当前位置开始，第二个指针比第一个快（k-1），所以当第二个等于Null时，则到链表的尾部，则第一个指针的位置就是K元素
	 */
	public Node findElem(Node head, int k) {
		if (k < 1) {
			return null;
		}
		Node p1 = head;
		Node p2 = head;
		for (int i = 0; i < (k - 1) && p1 != null; i++) {
			p1 = p1.next;
		}
		if (p1 == null) {
			System.out.println ("p not saft");
			return null;
		}
		while (p1.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	/**
	 * 从尾到头输出链表
	 */
	public void printListR(Node head) {
		if (head != null) {
			printListR (head.next);
			System.out.println (head.data);
		}
	}

	/**
	 * 寻找单链表的中间结点。
	 * 思路：两个指针，a指针每次走一步，b指针每次走2步。（当链表长度为奇数时，a指针指的就是中间节点，偶数时，指向的正是中间结点的前一个节点。）
	 * */
	public Node SearchMid(Node head){
		Node p = this.head;
		Node q = this.head;
		while(p!=null&&p.next!=null&&p.next.next!=null){
			p=p.next.next;
			q=q.next;
		}
		return q;
	}
	public static void main(String[] args) {
		LinkList linkList = new LinkList ();
		linkList.adddNode (3);
		linkList.adddNode (1);
		linkList.adddNode (4);
		linkList.adddNode (5);
		linkList.adddNode (3);
		linkList.adddNode (6);
		linkList.adddNode (9);
		//linkList.deleteNode (1);
		//linkList.deleteDuplecate1 (linkList.head);
		//Node elem = linkList.findElem (linkList.head, 3);
		//System.out.println (elem.data);
		//linkList.printListR (linkList.head);
		System.out.println (linkList.SearchMid (linkList.head).data);
		System.out.println ("length---->" + linkList.length ());
		linkList.printList ();

	}

}
