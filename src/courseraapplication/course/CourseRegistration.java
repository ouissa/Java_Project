
package courseraapplication.course;
import courseraapplication.AssociatedList;
import courseraapplication.user.Member;

public class CourseRegistration extends Registration{
    private Course course;
    private AssociatedList<Submission> Submissions;
    //public static final CourseRegistrationMemberComparator courseRegistrationMemberComparator = new CourseRegistrationMemberComparator();
    public CourseRegistration(Course course, RegistrationStatus status, boolean Completion, int grade, Member student) {
        super(status, Completion, grade, student);
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public double getGPA() throws invalidGradeexception{
        if (grade>=0 && grade<=100){
          if( grade >= 93) return 4.0;
          if( grade >= 90) return 3.67;
          if( grade >= 87) return 3.33;
          if( grade >= 83) return 3.0;
          if( grade >= 80) return 2.67;
          if( grade >= 77) return 2.33;
          if( grade >= 73) return 2.0;
          if( grade >= 70) return 1.67;
          if( grade >= 67) return 1.33;
          if (grade >= 60) return 1.0;
          return 0.0;    
        }
        else if (grade<0)
            throw new invalidGradeexception("negative grade!");         
        else if(grade>100)
            throw new invalidGradeexception("Grade higher than 100!!");
        
        return -1;
      }

    @Override
    public String toString() {
        return "CourseRegistration{"+super.toString()+ "course=" + course + '}';
    }
   
}
