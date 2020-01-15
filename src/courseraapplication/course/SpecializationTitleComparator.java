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
public class SpecializationTitleComparator implements Comparator<Specialization>{
    
    @Override
    public int compare(Specialization S1, Specialization S2)
    {
        return S1.getTitle().compareTo(S2.getTitle());
    }
}
