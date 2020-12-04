import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ListActivity {
    private ArrayList<Activity> activities = new ArrayList<Activity>(); //list of activities in a list
    private String listName;


    public ListActivity(String listName) {
        this.listName = listName;
    }

    public void addActivities(String name, String description, String tag){
        activities.add(new Activity(name, description, tag));
    }

    public String listActivities(){
        String str = "";
        for(int i =0; i<activities.size(); i++){
            str +=  i + " - " +  activities.get(i).toString()+ "\n";
        }
        return str;
    }

    public void updateActivity(int index, String name, String description, String tag){
       // System.out.println(activities.get(index).toString());
        Activity update = activities.get(index);
        if(name.length() > 0) update.setName(name);
        if(description.length()> 0) update.setDescription(description);
        if(tag.length() > 0) update.setTag(tag);
    }

    public boolean deleteActivity(int index){
        if(index>=0 && index<activities.size()){
            activities.remove(index);
            return true;
        }else {
            return false;
        }
    }

    public void shuffle(){
        Collections.shuffle(activities);
    }

    public Activity retrive(int index){
        return activities.get(index);
    }

    public String search(String str){
        String results = "";
        for(int i=0; i<activities.size(); i++){
            if(activities.get(i).toString().toLowerCase().contains(str.toLowerCase())){
                results += i+ " - " + activities.get(i).toString();
            }
        }
        return results;
    }
    public String toString(){
        return listName + " - Activities in list - " + activities.size();
    }
}
