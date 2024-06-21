import java.util.ArrayList;
import java.util.Scanner;
public class toDoList {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<>();
        while (true) {
            System.out.println("1) Add a task");
            System.out.println("2) To Show all tasks");
            System.out.println("3) Exit");

            String choice = obj.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the number of tasks you want to add:- ");
                    int noOfTasks = obj1.nextInt();
                    for (int i = 1; i <= noOfTasks; i++) {
                        System.out.println("Enter the "+i+" task:- ");
                        task.add(obj.nextLine());
                    }
                    break;
                case "2":
                    if (task.isEmpty()) {
                        System.out.print("No tasks yet!");
                    } else {
                        for (int i=0; i<task.size(); i++) {
                            System.out.println(i+1+". "+ task);                        }
                    }
                break;
                case "3":obj.close();
                         obj1.close();
                         return;
                default:System.out.print("Invalid input");

            }
        }
    }
}