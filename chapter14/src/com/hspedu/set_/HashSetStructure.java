package com.hspedu.set_;

public class HashSetStructure {
	public static void main(String[] args) {
		//模拟一个HashSet的底层(hashMap 的底层结构)
		
		//1.创建一个数组,数组的类型是 Node[]
		//2.有些人,直接把 Node[] 数组称为 表
		Node[] table = new Node[16];
		System.out.println("table="+ table);
		//3.创建节点
		Node john = new Node("john",null);
		
		table[2] = john;
		Node jack = new Node("jack",null);
		john.next = jack;//将jack节点挂载到john
		Node Rose = new Node("Rose",null);
		jack.next = Rose;//将Rose节点挂载到jack
		
		Node lucy = new Node("lucy",null);
		table[3] = lucy;//把lucy放在table表的索引为3的位置
		System.out.println("table="+ table);
	}
}
class Node{//节点,存放数据,可以指向下一个节点,从而形成链表
	Object item;//存放数据
	Node next;//下一个节点
	public Node(Object item, Node next) {
		super();
		this.item = item;
		this.next = next;
	}
	
}
