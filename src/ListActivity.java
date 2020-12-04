/**
 * @Author Ellen O Leary
 * Contain the list for activities and the base class for a new to do list
 */
import java.util.ArrayList;
import java.util.Collections;


public class ListActivity {
    private ArrayList<Activity> activities = new ArrayList<Activity>(); //list of activities in a list
    private String listName;

    /**
     * Coinstructor for a new list
     * @param listName name of list
     */
    public ListActivity(String listName) {
        this.listName = listName;
    }

    /**
     * adds an activity to array list
     * @param name name of activity
     * @param description description of activity
     * @param tag tag of activity
     */
    public void addActivities(String name, String description, String tag){
        activities.add(new Activity(name, description, tag));
    }

    /**
     * list of activities in the the current list
     * @return the string containing all activities
     */
    public String listActivities(){
        String str = "";
        for(int i =0; i<activities.size(); i++){
            str +=  i + " - " +  activities.get(i).toString()+ "\n";
        }
        return str;
    }

    /**
     * updates activity if the string in not null and the index is valid
     * @param index index of activity to be changed
     * @param name name to be updated
     * @param description description to be updated
     * @param tag tag to be updated
     */
    public void updateActivity(int index, String name, String description, String tag){
        if(index>=0 &&index<activities.size()){
            Activity update = activities.get(index);
            if (name.length() > 0) update.setName(name);
            if (description.length() > 0) update.setDescription(description);
            if (tag.length() > 0) update.setTag(tag);
        }
    }

    /**
     * deletes the activity if index is valid
     * @param index index of item to be deleted
     * @return true id index is valid otherwise return false
     */
    public boolean deleteActivity(int index){
        if(index>=0 && index<activities.size()){
            activities.remove(index);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Shuffles the list od activities
     */
    public void shuffle(){
        Collections.shuffle(activities);
    }

    /**
     * return the Activity at the index if valid
     * @param index the index to be gotten
     * @return the Activity at index
     */
    public Activity retrive(int index){
        if(index>=0 && index<activities.size()) {
            return activities.get(index);
        }else {
            return null;
        }
    }

    /**
     * Search through the list for the str and return all similar activities
     * @param str string to be found in the list
     * @return all activities that match the string
     */
    public String search(String str){
        String results = "";
        for(int i=0; i<activities.size(); i++){
            if(activities.get(i).toString().toLowerCase().contains(str.toLowerCase())){
                results += i+ " - " + activities.get(i).toString();
            }
        }
        return results;
    }

    /**
     * return the toString
     * @return the to string
     */
    public String toString(){
        return listName + " - Activities in list - " + activities.size();
    }
}
