
package courseraapplication.course;
import java.util.Comparator;
/**
 *
 * @author ouiss_000
 */
public class CourseFeesComparator  implements Comparator <Course>{
     @Override
    public int compare(Course C1,Course C2){
        return(int) (C2.getFees()-C1.getFees());
}
}
