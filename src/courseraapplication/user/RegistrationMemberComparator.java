/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courseraapplication.user;

import courseraapplication.course.Registration;
import java.util.Comparator;

/**
 *
 * @author FZ
 */

public class RegistrationMemberComparator implements Comparator<Registration>{
    @Override
    public int compare(Registration reg1,Registration reg2){
        return (int)(reg1.getStudent().getMemberProfile().getFirstName().compareTo(reg2.getStudent().getMemberProfile().getFirstName()));
    }

    
    
}
