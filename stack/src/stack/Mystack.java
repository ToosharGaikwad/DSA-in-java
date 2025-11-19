package stack;

public class Mystack {
	
	private int top = 0;
	private Node[] stack = new Node[10];
	static  Mystack ref = new Mystack();
	private Mystack(){
		
	}
	private Mystack(Node[] ref){
		stack = ref;
	}
	
	static public Mystack getObject() {
		return ref;
	}
	
	public Node[] getStack() {
		return stack;
	}
	public void setStack(Node[] stack) {
		this.stack = stack;
	}
	
	
	public void push(int value) {
		if(top==0)
		{
//			Node ref = new Node;
			stack[top++] = new Node(value);
	}
	}
	
}
