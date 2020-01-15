
package courseraapplication.course;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

import courseraapplication.user.Member;
import java.util.Comparator;

public class Submission  {
	private String submissionTitle;
	private File work;
	private float grade;
	private String submissionDate;
	private Member member;
	private CourseWork coursework;
	
	public Submission(String submissionTitle, File work, float grade) {
		this.submissionTitle = submissionTitle;
		this.work = work;
		this.grade = grade;
		setSubmissionDate();
	}
	public String getSubmissionTitle() {
		return submissionTitle;
	}
	public void setSubmissionTitle(String submission_title) {
		this.submissionTitle = submission_title;
	}
	public File getWork() {
		return work;
	}
	public void setWork(File work) {
		this.work = work;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public String getSubmissionDate() {
		return submissionDate;
	}
        // since the submission time depends on the current time, the programl sets the time automatically
	public void setSubmissionDate() {
		this.submissionDate = LocalDate.now().toString() + " " + LocalTime.now().toString();
	}
        
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public CourseWork getCoursework() {
		return coursework;
	}
	public void setCoursework(CourseWork coursework) {
		this.coursework = coursework;
	}

	@Override
	public String toString() {
		return "submission_title :" + submissionTitle + ", work :" + work + ", grade :" + grade
				+ ", submission_date :" + submissionDate + ", member :" + member + ", coursework=" + coursework + "]";
        }
}