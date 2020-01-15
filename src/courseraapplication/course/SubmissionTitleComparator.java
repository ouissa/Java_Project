package courseraapplication.course;

import java.util.Comparator;

/**
 *
 * @author FZ
 */
public class SubmissionTitleComparator implements Comparator <Submission>{
    @Override
    public int compare(Submission S1, Submission S2){
        return S1.getSubmissionTitle().compareTo(S2.getSubmissionTitle());
    }
}
