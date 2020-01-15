
package courseraapplication.user;

import courseraapplication.*;
import courseraapplication.course.Course;
import courseraapplication.course.Registration;
public class Member {
   
    private String email;
    private String password;
    private Profile memberProfile;
    private AssociatedList<Registration> registrationList;
    private AssociatedList<Course> WishCourses;
    public RegistrationMemberComparator RegistrationMemberComparator = new RegistrationMemberComparator();
    public Member(String email, String password,Profile memberProfile) {
        this.email = email;
        this.password = password;
        this.memberProfile = memberProfile;
        this.registrationList = new AssociatedList<>();
        this.WishCourses= new AssociatedList<> ();
    }
   
    public int changePass(String newPass,String oldPass)throws invalidPasswordException{
        if(getPassword().equals(oldPass)){
            setPassword(newPass);
            return 1;
        }else{
            return 0;
        }
    }
    
    public int authenticate(String userEmail, String userPassword){
        if(userEmail.equals(email) && userPassword.equals(password)){
            return 1;
        }
        else
            return 0;
    }
    
    public int forgotPass(int userCode, String newPass)throws invalidPasswordException{
        int systemCode = 378489; 
        if(userCode == systemCode){
            setPassword(newPass);
            return 1;
        }else{
            return 0;
        }
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword (String password) throws invalidPasswordException{
        if( password.length()>=8 && password.length()<=20) {
            this.password = password;
        } 
        else if(password.length()>20){
            throw new invalidPasswordException("Password too long!"); 
        }
        else if(password.length()<8){
            throw new invalidPasswordException("Password too short!"); 
        }
        
    }

    /**
     * @return the registrationList
     */
    public AssociatedList<Registration> getRegistrationList() {
        return registrationList;
    }

    /**
     * @param registrationList the registrationList to set
     */
    public void setRegistrationList(AssociatedList<Registration> registrationList) {
        this.registrationList = registrationList;
    }

    /**
     * @return the memberProfile
     */
    public Profile getMemberProfile() {
        return memberProfile;
    }

    /**
     * @param memberProfile the memberProfile to set
     */
    public void setMemberProfile(Profile memberProfile) {
        this.memberProfile = memberProfile;
    }

    /*
     * @return the WishCourses
     */
    public AssociatedList<Course> getWishCourses() {
        return WishCourses;
    }

    /**
     * @param WishCourses the WishCourses to set
     */
    public void setWishCourses(AssociatedList<Course> WishCourses) {
        this.WishCourses = WishCourses;
    }
    }
        
   
