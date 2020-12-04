import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //activity - done
    //lists class
    //list interface
    //list of list interface
    public static ArrayList<ListActivity> allLists = new ArrayList<ListActivity>();
    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args){
        allLists.add(new ListActivity("Currently"));
        int x=1;
        while (x!=0){
            System.out.println("Main menu");
            System.out.println("1. Add Activity");
            System.out.println("2. List Activities");
            System.out.println("3. Update Activity");
            System.out.println("4. Delete Activity");
            System.out.println("0. Exit");

            x = read.nextInt();

            switch(x){
                case 1:
                    addActivity();
                    break;
                case 2:
                    listActivities();
                    break;
                case 3:
                    updateActivity();
                    break;
                case 4:
                    deleteActivity();
                    break;
            }
        }
    }

    private static void deleteActivity() {
        listAllLists();
    }

    private static void updateActivity() {
        listAllLists();
    }

    private static void listActivities() {
        listAllLists();
        System.out.println("Choose list to see to");
        int i = read.nextInt();
        System.out.print(allLists.get(i).listActivities());
    }

    private static void addActivity() {
        listAllLists();
        System.out.println("Choose list to add to");
        int i = read.nextInt();

        System.out.print(allLists.get(i).listActivities());
        System.out.println("--------");
        read.nextLine();
        System.out.print("\nEnter name of activity : ");
        String name = read.nextLine();


        System.out.print("\nEnter description of activity");
        String description = read.nextLine();


        System.out.print("\nEnter tag for activity");
        String tag = read.nextLine();


        allLists.get(i).addActivities(name, description, tag);
        allLists.get(i).listActivities();
    }

    private static void listAllLists(){
        for(int i=0; i<allLists.size(); i++){
            System.out.println(i + " " + allLists.toString());
        }
    }
}
