package courseraapplication.course;

import courseraapplication.user.Member;
import java.io.File;

public class SpecializationRegistration extends Registration{
    private Specialization sp;
    private boolean CapstoneProjectStatus;
    private File Capstone;
    private CourseRegistration[] courses;
    private static SpecializatioRegistrationTitleComparator SpecializatioRegistrationTitleComparator = new SpecializatioRegistrationTitleComparator();
    public SpecializationRegistration(Specialization sp, boolean CapstoneProjectStatus, CourseRegistration[] courses,courseraapplication.course.RegistrationStatus status, boolean Completion, int grade, Member student) {
       super(status, Completion, grade, student);
        this.sp = sp;
        this.CapstoneProjectStatus = CapstoneProjectStatus;
        this.courses = courses;
    }
  
    

    public boolean isCapstoneProjectStatus() {
        return CapstoneProjectStatus;
    }

    public void setCapstoneProjectStatus(boolean CapstoneProjectStatus) {
        this.CapstoneProjectStatus = CapstoneProjectStatus;
    }

  
    public File getCapstone() {
        return Capstone;
    }
    public void setCapstone(File Capstone) {
        this.Capstone = Capstone;
    }

    @Override
    public double getGPA() throws invalidGradeexception{
        double GPA=0.0;
        double total=0.0;
       for (CourseRegistration arr: courses){
           GPA+=arr.getGPA()*arr.getCourse().getNumCredits();
           total+=arr.getCourse().getNumCredits();
       } 
           return GPA/total;
    } 

    public CourseRegistration[] getCourses() {
        return courses;
    }
    public void setCourses(CourseRegistration[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "SpecializationRegistration{" +super.toString() +"sp=" + getSp() + ", CapstoneProjectStatus=" + CapstoneProjectStatus + ", Capstone=" + Capstone + '}';
    }

    /**
     * @return the sp
     */
    public Specialization getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(Specialization sp) {
        this.sp = sp;
    }
 
            
            

    }
    

