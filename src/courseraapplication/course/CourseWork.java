
package courseraapplication.course;

import java.io.File;
import java.util.GregorianCalendar;

public class CourseWork {
    private String reference;
    private String title;
    private File file;
    private String type;
    private GregorianCalendar deadline;
    public static final CourseWorkTitleComparator CourseWorkTitleComparator = new CourseWorkTitleComparator();

    public CourseWork(String reference, String title, File file, String type, GregorianCalendar deadline) {
        this.reference = reference;
        this.title = title;
        this.file = file;
        this.type = type;
        this.deadline = deadline;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GregorianCalendar getDeadline() {
        return deadline;
    }

    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return  "reference=" + reference + ", title=" + title + "type=" + type + "deadline=" + deadline ;
    }
    
    
    
    
}