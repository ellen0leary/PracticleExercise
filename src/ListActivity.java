import java.util.ArrayList;

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

    public String toString(){
        return listName + " - Activities in list - " + activities.size();
    }
}
