package menuDrivenDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItems {
	Scanner sc = new Scanner(System.in);
	
	private List<MenuItems> dsItems = new ArrayList<>();
	private List<MenuItems> linkedListItems = new ArrayList<>();
	private List<MenuItems> stackItems= new ArrayList<>();
	private List<MenuItems> queueItems= new ArrayList<>();
	private List<MenuItems> arrayItems= new ArrayList<>();
	//TODO:create new List for Stack, Queue, Array
	private LinkedList linkedList = new LinkedList();
	private Stack stack= new Stack();
	private Queue queue= new Queue(5);
	private Array array= new Array(5);
	
	//TODO: create objects of Stack, Queue, Array
	
	public Menu(int order, String name) {
		super(order, name);
		
	}

	public Menu(String title) {
		super(0, title);
	}

	public void addMenuItems(MenuItems mi) {
		dsItems.add(mi);
	}

	public List<MenuItems> getMenuItems() {
		return dsItems;
	}

	public void display() {

		
		int choice = 0;
		
		
		
		stackItems.add(new MenuItems(1,"Add Elements into Stack:"));
		stackItems.add(new MenuItems(2,"Check the stack, empty or not:"));
		stackItems.add(new MenuItems(3,"Remove Element from Stack:"));
		stackItems.add(new MenuItems(4,"Top Element in the Stack:"));
		
		queueItems.add(new MenuItems(1,"Add Elements into Queue:"));
		queueItems.add(new MenuItems(2,"Check the Queue, empty or not:"));
		queueItems.add(new MenuItems(3,"Remove Element from Queue:"));
		queueItems.add(new MenuItems(4,"Top Element in the Queue:"));
		
		arrayItems.add(new MenuItems(1,"Add Elements into Array:"));
		arrayItems.add(new MenuItems(2,"Display all Elements:"));
		arrayItems.add(new MenuItems(3,"Resize the elements:"));
		
		linkedListItems.add(new MenuItems(1, "Add Elements to Linked List:"));
		linkedListItems.add(new MenuItems(2, "Display Linked List:"));
		
		//TODO:Add Menu Items to new Menu's created
		
		do {

			System.out.println(getName());
			for (MenuItems mi : getMenuItems()) {
				System.out.println(mi.getOrder() + "." + mi.getName());
			}
			System.out.println("Enter the choice of Data Structure:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1: displayStackMenu();
			   break;
			   case 2:displayQueueMenu();
			   break;
			   case 3:displayArrayMenu();
			   break;
			   case 4 :displayLinkedListMenu();
			   break;
			   case 5: System.out.println("Enter 5 to Exit!!");
			   break;
			   default: System.out.println("Enter valid choice!!");
			}

		} while (choice != (getMenuItems().size() + 1));

	}
	
	//TODO: add new display functions for Stack, Queue and dynamic array
	public void displayStackMenu() {
		
		int choice=0;
		
		do {
			
			System.out.println("Stack Sub Menu: ");
			for(MenuItems mi:getStackItems()) {
				System.out.println(mi.getOrder()+ " . "+ mi.getName());
			}
			System.out.println("Please Enter Your Choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter an Elements into Stack: ");
				int data = sc.nextInt();
				stack.push(data);
				
				System.out.println("Elements added successfully");
			}
			break;
			case 2:{
				System.out.println("Stack is empty: "+stack.isEmpty());
			}
			break;
			case 3:{
				
				System.out.println("Element deleted successfully: "+stack.pop());
			}
			break;
			case 4:{
				System.out.println("Top Element of the stack : " + stack.peek());
				
			}
			break;
			case 5:{
				System.out.println("Enter 5 to exit!!");
			}
			break;	
		    default: System.out.println("Enter valid Stack Menu!!");
			break;
			}
			
		}while(choice!=(getStackItems().size()+1) );
		
	}
	
	public void displayQueueMenu() {
		
		int choice=0;
		do {
			System.out.println("Queue Sub Menu:");
			for(MenuItems mi: getQueueItems()) {
				System.out.println(mi.getOrder() + ". "+ mi.getName());
			}
			System.out.println("Please Enter Your Choice ");
			choice= sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter an element into Queue: ");
				int data= sc.nextInt();
				queue.enqueue(data);
				System.out.println("Element added successfully: ");
			}
			break;
			case 2:{
				System.out.println("Queue is empty: "+queue.isEmpty());
			}
			break;
			case 3:{
				System.out.println("Element deleted successfully: "+ queue.dequeue());
				}
			break;
			case 4:{
				System.out.println("Top Element of the queue : "+ queue.peak());
			}
			break;
			case 5:{
				System.out.println("Enter 5 to exit!!");
			}
			default:
			    System.out.println("Enter valid Queue Menu!!");
			}
			
		}while(choice!=(getQueueItems().size()+1));
		
	}
	
	
	public void displayArrayMenu() {
		
		int choice=0;
		do {
		System.out.println("Array sub menu:");
		for(MenuItems mi: getArrayItems()) {
			System.out.println(mi.getOrder()+ "."+ mi.getName());
		}
		System.out.println("Please enter your choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("Enter an element into Array");
			int data=sc.nextInt();
			array.add(data);
			System.out.println("Elements are added successfully");
		}
		break;
		case 2:{
			array.display(); 
		}
		break;
		case 3:{
			System.out.println("Enter the size to extend Array");
			int data=sc.nextInt();
			array.resize(data);
			System.out.println("Size exceeds an array");
		}
		break;
		case 4:{
			System.out.println("Enter 4 to exit!!");
		}
		break;
		default: System.out.println("Enter valid Array Menu!!");
			break;
		}
		}while(choice!= (getArrayItems().size()+1));
		
	}
	
	public void displayLinkedListMenu()
	{
		
		int choice = 0;
		
		do {

			System.out.println("Linked List Sub Menu: ");
			for (MenuItems mi : getLinkedListItems()) {
				System.out.println(mi.getOrder() + "." + mi.getName());
			}
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
				{
					System.out.println("Enter the element for new node : ");
					int data = sc.nextInt();
					linkedList.add(data);
					System.out.println("Element added successfully");
				}
				break;

				case 2:
				{
					System.out.println("Displaying Linked List");
					linkedList.display();
				}
				break;
				case 3:{
					System.out.println("Enter 3 to exit!!");
				}
				break;	
				default: System.out.println("Enter valid Linked List Menu!!");
				break;
			
			}

		} while (choice != (getLinkedListItems().size() + 1));
	}
	
	public List<MenuItems> getStackItems(){
		return stackItems;
	}
	public List<MenuItems> getQueueItems() {
		return queueItems;
	}
	public List<MenuItems> getArrayItems() {
		return arrayItems;
	}
	public List<MenuItems> getLinkedListItems() {
		return linkedListItems;
	}

	

}
