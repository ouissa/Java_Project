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
public class MaterialTitleComaparator implements Comparator<Material>{
      public int compare(Material C1,Material C2){
        return (int)(C1.getTitle().compareTo(C2.getTitle()));
}
}
