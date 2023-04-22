package com.hspedu.collection_;

public class LinkedList01 {
	@SuppressWarnings("unused")
	private static Node first;

	@SuppressWarnings("all")
	public static void main(String[] args) {
		// 模拟一个简单的双向链表
		Node jack = new Node("jack");
		Node tom = new Node("tom");
		Node hsp = new Node("老韩");

		// 连接三个节点,形成双向链表
		// jack -> tom -> hsp
		jack.next = tom;
		tom.next = hsp;
		// hsp -> tom -> jack
		hsp.pre = tom;
		tom.pre = jack;

		Node first = jack;// 让first引用指向jack,就是双向链表的头节点
		Node last = hsp;// 让last引用指向hsp,就是双向链表的尾结点

		// 演示,从头到尾进行遍历
		System.out.println("=====");
		while (true) {
			if (first == null) {
				break;
			}
			// 输出first信息
			System.out.println(first);
			first = first.next;
		}
		// 从后到前
		System.out.println("===从后到前===");
		while (true) {
			if (last == null) {
				break;
			}
			System.out.println(last);
			last = last.pre;
		}

		// 要求,在tom和老韩直接,插入一个对象
		// 1 先创建一个 Node 节点, name 就是 baozi
		Node baozi = new Node("包子");
		// 2 改变连接指向
		baozi.next = hsp;
		baozi.pre = tom;
		hsp.pre = baozi;
		tom.next = baozi;

		// 再次遍历
		first = jack;// 重置first
		System.out.println("=====");
		while (true) {
			if (first == null) {
				break;
			}
			// 输出first信息
			System.out.println(first);
			first = first.next;
		}
	}
}

//定义一个Node 类,Node 对象 表示双向链表的一个节点
class Node {
	public Object item;// 真正存放数据的地方,所以使用obj
	public Node next;// 指向下一个节点
	public Node pre;// 指向上一个节点

	public Node(Object item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "Node [name=" + item + "]";
	}

}