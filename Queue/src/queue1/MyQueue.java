package queue1;

import java.util.Queue;

import stack.Mystack;

public class MyQueue {
	int head=0;
	int tail =0;
	
	
	private Node[] queue = new Node[10];
	MyQueue = new MyQueue();
	public MyQueue() {
		
	}

	private static MyQueue(int head,int tail){		
		this.head = head;
		this.tail = tail;
	}

	

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void push() {
		queue[top++] = new Node(value);
	}
	
	public void pop() {
		queue[top--] = new Node(value);
	}
	static public MyQueue getObject() {
		return ref;
	}
	
}
