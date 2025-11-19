package stack;

public class Mainapp {

	public static void main(String[] args) {
		
	Mainapp app = new Mainapp();
	app.insert(20);
	app.insert(10);
	Mystack obj =  Mystack.getObject();
	System.out.println(obj.hashCode());
		
		
		
	}
		
	public static void insert(int value) 
	{
		Mystack ref =Mystack.getObject();
		System.out.println(ref.hashCode());
		ref.push(value);
	}
	
}
