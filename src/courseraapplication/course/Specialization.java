package courseraapplication.course;

import courseraapplication.AssociatedList;
import java.util.Arrays;

public class Specialization {
    private String reference;
    public String title; 
    private String description;
    private String capstornProject;
    private String faq[];
    private int fees;
    private AssociatedList<Course> Courses;
    private AssociatedList<SpecializationRegistration> SpecializationregistrationList;
    public static final SpecializationTitleComparator SpecializationTitleComparator = new SpecializationTitleComparator();
  
    public Specialization(String reference, String title, String description, String capstornProject, String[] faq, int fees) {
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.capstornProject = capstornProject;
        this.faq = faq;
        this.fees = fees;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCapstornProject() {
        return capstornProject;
    }

    public void setCapstornProject(String capstornProject) {
        this.capstornProject = capstornProject;
    }

    public String[] getFaq() {
        return faq;
    }

    public void setFaq(String[] faq) {
        this.faq = faq;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
    public void register(SpecializationRegistration ele){
        SpecializationregistrationList.addElement(ele);
    }
    @Override
    public String toString() {
        return "Specialization{" + "reference=" + reference + ", title=" + title + ", description=" + description + ","
                + " capstornProject=" + capstornProject + ", faq=" + Arrays.toString(faq) + ", fees=" + fees + '}';
    }
    
    
}
