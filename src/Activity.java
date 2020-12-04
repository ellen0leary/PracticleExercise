/**
 * @Author Ellen O Leary
 * Contain the base class for Activity
 */
public class Activity {
    private String name;
    private String description;
    private String tag;


    /**
     * 
     * @param name
     * @param description
     * @param tag
     */
    public Activity(String name, String description, String tag) {
        this.name = name;
        this.description = description;
        this.tag = tag;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
