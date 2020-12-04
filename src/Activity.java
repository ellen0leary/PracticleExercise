public class Activity {
    private String name;
    private String description;
    private String tag;


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
}
