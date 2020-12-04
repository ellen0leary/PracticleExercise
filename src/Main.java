import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //activity - done
    //lists class
    //list interface
    //list of list interface
    public static ArrayList<ListActivity> allLists = new ArrayList<ListActivity>();

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
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
    }

    private static void addActivity() {
        listAllLists();
    }

    private static void listAllLists(){
        for(int i=0; i<allLists.size(); i++){
            System.out.println(allLists.toString());
        }
    }
}
