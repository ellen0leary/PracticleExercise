/**
 * @Author Ellen O Leary
 * The main class for this application
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static ArrayList<ListActivity> allLists = new ArrayList<ListActivity>(); //array list for all to do lists
    private static Scanner read = new Scanner(System.in); //creates a scanner that reads input

    /**
     * the main method - contains the main menu and switch statment
     * @param args
     */
    public static void main(String[] args){
        int x=1;
        while (x!=0){
            System.out.println("Main menu");
            System.out.println("------------");
            System.out.println("1. Create ToDo list");
            System.out.println("2. List ToDo Lists");
            System.out.println("3. Delete List");
            System.out.println("------------");
            System.out.println("4. Add Activity");
            System.out.println("5. List Activities");
            System.out.println("6. Update Activity");
            System.out.println("7. Delete Activity");
            System.out.println("------------");
            System.out.println("8. Choose an Activity");
            System.out.println("9. Search through all Activites");
            System.out.println("0. Exit");

            x = read.nextInt();

            switch(x){
                case 1:
                    createList();
                    break;
                case 2:
                    listAllLists();
                    break;
                case 3:
                    deleteList();
                    break;
                case 4:
                    addActivity();
                    break;
                case 5:
                    listActivities();
                    break;
                case 6:
                    updateActivity();
                    break;
                case 7:
                    deleteActivity();
                    break;
                case 8:
                    shuffleActivities();
                    break;
                case 9:
                    search();
                    break;
                default:
                    System.out.println("Incorrect value entered. Try again");
            }
        }
    }

    /**
     * case 1 - alloiw the user to create a new list
     */
    private static void createList(){
        read.nextLine();
        System.out.println("Enter list name");
        String name = read.nextLine();

        allLists.add(new ListActivity(name));
    }

    /**
     * case 2 - prints all to do list to console
     */
    private static void listAllLists(){
        for(int i=0; i<allLists.size(); i++){
            System.out.println(i + " " + allLists.get(i).toString());
        }
    }

    /**
     * case 3 - delete a to do list
     */
    private static void deleteList(){
        listAllLists();
        System.out.println("Choose list to delete");
        int i = read.nextInt();
        if(i>=0 && i<allLists.size()){
            System.out.println("Deleting List ...");
            allLists.remove(i);
        }else{
            System.out.println("Can't delete that List");
        }

    }

    /**
     * case 4 - adds an activity to a to do list
     */
    private static void addActivity() {
        if(checkAllLists()) {
            listAllLists();
            System.out.println("Choose list to add to");
            int i = read.nextInt();

            System.out.print(allLists.get(i).listActivities());
            System.out.println("--------");
            read.nextLine();
            System.out.print("\nEnter name of activity : ");
            String name = read.nextLine();


            System.out.print("\nEnter description of activity : ");
            String description = read.nextLine();


            System.out.print("\nEnter tag for activity : ");
            String tag = read.nextLine();


            allLists.get(i).addActivities(name, description, tag);
            allLists.get(i).listActivities();
        }
    }

    /**
     * case 5 - lists all activities to console
     */
    private static void listActivities() {
        if(checkAllLists()) {
            listAllLists();
            System.out.println("Choose list to see to");
            int i = read.nextInt();
            System.out.print(allLists.get(i).listActivities());
        }
    }

    /**
     * case 6 - updates an activity based on user inputs
     */
    private static void updateActivity() {
        if(checkAllLists()) {
            listAllLists();
            System.out.println("Choose list to see to");
            int i = read.nextInt();
            System.out.print(allLists.get(i).listActivities());

            System.out.println("Choose an activity to update");
            int j = read.nextInt();

            read.nextLine();

            System.out.println("Enter the new name");
            String name = read.nextLine();

            System.out.println("Enter the new description");
            String description = read.nextLine();

            System.out.println("Enter the new tag");
            String tag = read.nextLine();

            allLists.get(i).updateActivity(j, name, description, tag);
        }
    }

    /**
     * case 7 - deletes the activity in a to do list
     */
    private static void deleteActivity() {
        if(checkAllLists()) {
            listAllLists();
            System.out.println("Choose list to see to");
            int i = read.nextInt();
            System.out.print(allLists.get(i).listActivities());
            System.out.println("Choose an activity to delete");
            int j = read.nextInt();
            if (allLists.get(i).deleteActivity(j)) System.out.println("Activity deleted");
            else System.out.println("activity not deleted");
        }
    }

    /**
     * case 8 - shuffle the activities in a to do list and return the first one in the list
     */
    private static void shuffleActivities() {
        if (checkAllLists()) {
            listAllLists();
            System.out.println("Choose list to shuffle to");
            int i = read.nextInt();
            System.out.println("Shuffling list");
            allLists.get(i).shuffle();
            System.out.println("Start with:");
            System.out.println(allLists.get(i).retrive(0).toString());
        }

    }

    /**
     * case 9 - search through all activities and to do list for a specific item
     */
    public static void search(){
        String results = "";
        if (checkAllLists()) {
            read.nextLine();
            System.out.println("Enter a search term");
            String str = read.nextLine();

            for(int i=0 ;i<allLists.size(); i++){
                results += i +"\n" + allLists.get(i).search(str);
            }
        }
        System.out.println(results);
    }

    /**
     * checks if the is a to do list in allList
     * @return truye if the is a list in allList otherwise false
     */
    private static boolean checkAllLists(){
        if(allLists.size() == 0){
            System.out.println("Add ToDo list first");
            return false;
        }
        return true;
    }
}
