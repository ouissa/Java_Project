
package courseraapplication.user;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Profile {
    private String firstName;
    private String lastName;
    private Gender userGender;
    private Calendar birthDay;
    private String location;
    private String occupation;
    private String highestDegree;
    private String majorField;
    private String[] skills;
    private String[] carrerGoals;

    public Profile(String firstName, String lastName, String userGender, String location, String occupation,String highestDegree, String majorField, String[] skills, String[] carrerGoals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.occupation = occupation;
        this.majorField = majorField;
        this.highestDegree = highestDegree;
        this.skills = skills;
        this.carrerGoals = carrerGoals;
        this.birthDay= GregorianCalendar.getInstance();
        setUserGender(userGender);      
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public String[] getSkills() {
        return skills; 
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getCarrerGoals() {
        return carrerGoals;
    }

    public void setCarrerGoals(String[] carrerGoals) {
        this.carrerGoals = carrerGoals;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = Gender.valueOf(userGender.toUpperCase());
    }
    
    public Calendar getBirthDay() { 
        return birthDay;
    }

    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }
    
    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }
    

    @Override
    public String toString() {
     
        return  "firstName=" + firstName + ", lastName=" + lastName + ", userGender=" + userGender.toString() + ", location=" +
                location + ", occupation=" + occupation + ", majorField=" + majorField + ", highest degree : " + highestDegree + "skills=" + Arrays.toString(skills)
                + ", carrerGoals=" + Arrays.toString(carrerGoals)+ " the date is : " +birthDay.getTime() ;
    
}
}
