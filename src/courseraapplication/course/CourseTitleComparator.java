/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseraapplication.course;

import java.util.Comparator;


public class CourseTitleComparator implements Comparator <Course> {
     @Override
    public int compare(Course C1,Course C2){
        return (int)(C1.getTitle().compareTo(C2.getTitle()));
}
}
