package menuDrivenDS;



public class DsDemoApp {
	public static void main(String args[]) {
		Menu mainMenu=new Menu("List of Data Structures Menu:");
		mainMenu.addMenuItems(new MenuItems(1, "Stack"));
		mainMenu.addMenuItems(new MenuItems(2, "Queue"));
		mainMenu.addMenuItems(new MenuItems(3, "Array"));
		mainMenu.addMenuItems(new MenuItems(4, "LinkList"));
		
		mainMenu.display();
		
	}

}
