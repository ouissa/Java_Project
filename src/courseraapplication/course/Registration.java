
package courseraapplication.course;

import courseraapplication.user.Member;


public abstract class Registration {
    private RegistrationStatus status;
    private boolean Completion;
    protected int grade;
    private Member student;
    

    public Registration(RegistrationStatus status, boolean Completion, int grade, Member student) {
        this.status = status;
        this.Completion = Completion;
        this.grade = grade;
        this.student = student;
    }
    
    
    private void setCompletion(){
        this.Completion = getGrade()>80;
    }
    
    public String getCompletion(){
        String str;
        if(Completion == true){
            str = "completed";
        }else{
            str = "in progress";
        }
        return str;
    }
    public String getStatus() {
        return status.toString();
    }

    public void setStatus(String status) {
        this.status = RegistrationStatus.valueOf(status.toUpperCase());
    }
    public int getGrade() {
        return grade;
    }
    
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
     public Member getStudent() {
        return student;
    }

    public void setStudent(Member student) {
        this.student = student;
    }
    
    
    @Override
    public String toString() {
        return  "status=" + getStatus() + ", Completion=" + getCompletion() + ", grade=" + getGrade() + "student = " + student.toString() ;
    }   
  public abstract double getGPA() throws invalidGradeexception;
   
    
}
