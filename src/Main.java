import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //activity - done
    //lists class
    //list interface
    //list of list interface
    public ArrayList<List> allLists = new ArrayList<List>();

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x=1;
        while (x!=0){
            System.out.println("Main menu");
            System.out.println("1. Add Activity");
            System.out.println("2. List Activities");
            System.out.println("3. Update Activity");
            System.out.println("4. Delete Activity");
            System.out.println("0. Exit");

            x = read.nextInt();

            switch(0){
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
            }
        }
    }

    private static void deleteActivity() {
        
    }

    private static void updateActivity() {
    }

    private static void listActivities() {

    }

    private static void addActivity() {
    }

}
