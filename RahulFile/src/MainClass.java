import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		
		welcomeMsg();
		try {
			menu();
		} catch (NoSuchElementException e) {
			System.out.println("No such element");
		}	
	}

	public static void welcomeMsg() {
		System.out.println("Application Name : LOCKED ME \n");
		System.out.println("Developed By: Rahul Chaitanya Bandari \n");
	}

	public static void menu() throws NoSuchElementException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperations obj = new BusinessLevelOperations();
		int option;
		do {
		System.out.println("Enter your choice to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for Business level operation");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from BOL menu");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Thanks for using the Application...");
			break;
		default:
			System.out.println("Invalid choice");sc.close();
		}
		}while(option!=3);
		
	}
}

	