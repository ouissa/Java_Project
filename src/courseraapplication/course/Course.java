
package courseraapplication.course;
import courseraapplication.AssociatedList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.GregorianCalendar;
import java.util.Arrays;


public class Course  {
    private String reference;
    private GregorianCalendar sessionTime ;
    public String title;
    private String description;
    private int NumCredits;
    private String partnerInstitution;
    private String intended[];
    private String creators[];
    private double fees;
    private Certificate certificate;
    private AssociatedList<Topic> Topics;
    private AssociatedList<CourseWork> Coursework;
    private AssociatedList<CourseRegistration> Courseregistration;
    
    public Course(String reference, GregorianCalendar sessionTime, String title, String description, String[] intended, String[] creators, double fees, String certificate, String partnerInstitution) {
        this.reference = reference;
        this.sessionTime = sessionTime;
        this.title = title;
        this.description = description;
        this.intended = intended;
        this.creators = creators;
        this.fees = fees;
        this.partnerInstitution = partnerInstitution;
        setCertificate(certificate);
        this.Topics=new AssociatedList<>();
        this.Coursework=new AssociatedList<>();
        this.Courseregistration=new AssociatedList<>();
    }

    public Course(String reference, GregorianCalendar sessionTime, String title, String description,  String[] intended, String[] creators, double fees, String partnerInstitution, int NumCredits) {
        this.reference = reference;
        this.sessionTime = sessionTime;
        this.title = title;
        this.description = description;
        this.NumCredits = NumCredits;
        this.partnerInstitution = partnerInstitution;
      
        this.intended = intended;
        this.creators = creators;
        this.fees = fees;
        
    }
    
    
    public Course(String reference,String title, String description,double fees,String cert) {
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.fees = fees;
        setCertificate(cert);
        
    }
    
    

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

     public String getSessionTime() {
        String str;
        GregorianCalendar sessionTime = new GregorianCalendar();
        str = sessionTime.MONTH + "/" + sessionTime.DAY_OF_MONTH + "/" + sessionTime.YEAR;
        return str;
    }

    public void setSessionTime(GregorianCalendar sessionTime) {
        this.sessionTime = sessionTime;
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

    public String[] getIntended() {
        return intended;
    }

    public void setIntended(String[] intended) {
        this.setIntended(intended);
    }

    public String[] getCreators() {
        return creators;
    }

    public void setCreators(String[] creators) {
        this.setCreators(creators);
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getCertificate() {
        return certificate.toString();
    }

    public void setCertificate(String certificate) {
        this.certificate = Certificate.valueOf(certificate.toUpperCase());
    }

    

    public String getPartnerInstitution() {
        return partnerInstitution;
    }

    public void setPartnerInstitution(String partnerInstitution) {
        this.partnerInstitution = partnerInstitution;
    }

    /**
     * @return the NumCredits
     */
    public int getNumCredits() {
        return NumCredits;
    }

    /**
     * @param NumCredits the NumCredits to set
     */
    public void setNumCredits(int NumCredits) {
        this.NumCredits = NumCredits;
    }

   
    
    /**
     * @return the Topics
     */
    public AssociatedList<Topic> getTopics() {
        return Topics;
    }

    /**
     * @param Topics the Topics to set
     */
    public void setTopics(AssociatedList<Topic> Topics) {
        this.Topics = Topics;
    }

    /**
     * @return the Coursework
     */
    public AssociatedList<CourseWork> getCoursework() {
        return Coursework;
    }

    /**
     * @param Coursework the Coursework to set
     */
    public void setCoursework(AssociatedList<CourseWork> Coursework) {
        this.Coursework = Coursework;
    }

   
    public AssociatedList<CourseRegistration> getCourseregistration() {
        return Courseregistration;
    }

   
    public void setCourseregistration(AssociatedList<CourseRegistration> Courseregistration) {
        this.Courseregistration = Courseregistration;
    }
     public void register(CourseRegistration ele){
        Courseregistration.addElement(ele);
    }
     
     @Override
    public String toString() {
        return  getTitle();
    }
    
    
    
}
