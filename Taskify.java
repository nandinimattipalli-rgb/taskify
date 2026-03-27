import java.util.ArrayList;
import java.util.Scanner;

public class Taskify {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
          System.out.println("\n=== MY Taskify ===");
            System.out.println("\n1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task saved!!");
            } 
            else if (choice == 2) {
                System.out.println("\nYour Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter task number to delete: ");
                int index = sc.nextInt();

                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task deleted!");
                } else {
                    System.out.println("Invalid number!");
                }
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
