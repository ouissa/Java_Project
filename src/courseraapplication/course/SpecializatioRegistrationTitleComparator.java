/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseraapplication.course;
import java.util.Comparator;

/**
 *
 * @author FZ
 */
public class SpecializatioRegistrationTitleComparator implements Comparator<SpecializationRegistration>{
    @Override
    public int compare(SpecializationRegistration reg1,SpecializationRegistration reg2){
        return (int)(reg1.getSp().getTitle().compareTo(reg2.getSp().getTitle()));
}


    
    
}