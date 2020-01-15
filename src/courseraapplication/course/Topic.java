
package courseraapplication.course;

import courseraapplication.AssociatedList;
import java.util.Comparator;


public class Topic  {

    private String title;
    private String description;
    private AssociatedList<Material> Material;
    public static final TopicTitleComparator TopicTitleComparator = new TopicTitleComparator();
    public Topic(String title, String description) {
        this.title = title;
        this.description = description;
        this.Material=new AssociatedList<>();

    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" + "title=" + title + ", description=" + description + '}';
    }

}
   
    
