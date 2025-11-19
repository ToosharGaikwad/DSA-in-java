package linklist;


import java.util.Scanner;

public class Dlinklist {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myLinkedList list = new myLinkedList();
        int choice, data, pos;

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Delete First");
            System.out.println("4. Delete End");
            System.out.println("5. Insert at Position");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.addBeginning(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.addEnd(data);
                    break;

                case 3:
                    list.deleteFirst();
                    break;

                case 4:
                    list.deleteEnd();
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtPosition(pos, data);
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
	}

}
}
