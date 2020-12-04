import java.util.ArrayList;

public class List {
    private ArrayList<Activity> activities = new ArrayList<Activity>(); //list of activities in a list
    private String listName;


    public List(String listName) {
        this.listName = listName;
    }

    public void addActivities(String name, String description, String tag){
        activities.add(new Activity(name, description, tag));
    }

    public void listActivities(){
        for(int i =0; i<activities.size(); i++){
            System.out.println(activities.get(i).toString());
        }
    }

    public void updateActivity(int index){
        System.out.println(activities.get(index).toString());
    }

    public boolean deleteActivity(int index){
        if(index>=0 && index<activities.size()){
            activities.remove(index);
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return "";
    }
}
