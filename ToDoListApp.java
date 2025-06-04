package hello;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		while(true) {
			System.out.println("Simple To-Do-List-App");
			System.out.println("1. add a task");
			System.out.println("2. view a task");
			System.out.println("3. delete a task");
			System.out.println("4. exit");
			System.out.println("Choose an option(1-4)");
			
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice ==1) {
				System.out.println("enter your task");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Task added succesfully");
			}else if(choice ==2) {
				if(tasks.isEmpty()) {
					System.out.println(" no task found");
				}else {
					System.out.println("YOUR TASKS");
					for(int i=0;i<tasks.size();i++) {
						System.out.println((i+1)+" "+tasks.get(i));
					}
				}
			}else if(choice == 3) {
				if(tasks.isEmpty()) {
					System.out.println("nothing to delete");
				}else {
					System.out.println("enter task number to delete");
					int tasknum=sc.nextInt();
					if(tasknum>=1 && tasknum<=tasks.size()) {
						tasks.remove(tasknum-1);
						System.out.println("task deleted");
					}else {
						System.out.println("invalid number");
					}
				}
			}else if(choice == 4) {
				System.out.println("GOODBYE !!");
				break;
			}else {
				System.out.println("please choose a valid option");
			}
		}
		sc.close();
	}
}
