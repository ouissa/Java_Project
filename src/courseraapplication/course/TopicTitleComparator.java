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
public class TopicTitleComparator implements Comparator<Topic>{
    @Override
     public int compare(Topic c1, Topic c2){
        return (int)(c1.getTitle().compareTo(c2.getTitle()));
    }
}
