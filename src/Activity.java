/**
 * @Author Ellen O Leary
 * Contain the base class for Activity
 */
public class Activity {
    private String name;
    private String description;
    private String tag;


    /**
     * Coinstructor for activity class
     * @param name name of activity
     * @param description description fo activity
     * @param tag tag of activity
     */
    public Activity(String name, String description, String tag) {
        this.name = name;
        this.description = description;
        this.tag = tag;
    }


    /**
     * Gets the name of the activity
     * @return neme of activity
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name if the activity
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the activity
     * @return description of activity
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets the description of the activity
     * @param description new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * gets the tag of the activity
     * @return tag of activity
     */
    public String getTag() {
        return tag;
    }

    /**
     * sets the tag of the activity
     * @param tag new tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     *  the to string of the class
     * @return the toString
     */
    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
