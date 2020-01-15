/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseraapplication.Course;

import courseraapplication.course.CourseRegistration;
import java.util.Comparator;



public class CourseRegistrationMemberComparator implements Comparator<CourseRegistration>{
    @Override
    public int compare(CourseRegistration reg1,CourseRegistration reg2){
        return (int)(reg1.getStudent().getMemberProfile().getFirstName().compareTo(reg2.getStudent().getMemberProfile().getFirstName()));
    }

    
    
}
