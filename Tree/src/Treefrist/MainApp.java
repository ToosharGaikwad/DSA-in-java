package Treefrist;

public class MainApp {
	public static void main(String[] args) {

		

		   
		        MainApp m1 = new MainApp();
		        m1.insert("yash");
		        m1.insert("Aditya");
		        m1.insert("Raj");

		        System.out.println("Added Data");
		    }
	
	  	Node root;

		    private void insert(String value) {
		        root = insertValue(root, value);
		    }

		    private Node insertValue(Node root, String value) {

		        if (root == null) {
		            return new Node(value);
		        }

		        if (value.compareTo(root.data) > 0) {
		            root.right = insertValue(root.right, value);
		        } else if (value.compareTo(root.data) < 0) {
		            root.left = insertValue(root.left, value);
		        }

		        return root;
		    }
		}

