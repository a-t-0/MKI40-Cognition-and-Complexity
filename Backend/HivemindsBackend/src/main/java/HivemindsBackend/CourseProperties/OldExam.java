package HivemindsBackend.CourseProperties;

import java.time.LocalDate;
import java.util.ArrayList;

public class OldExam {
	private String oldExamSource;
	private int oldExamNr;
	private LocalDate oldExamDate;
	private int nrOfQuestions;
	private ArrayList<ExamQuestion> oldExamQuestions;

	public OldExam(String oldExamSource, LocalDate oldExamDate, int nrOfQuestions,
			ArrayList<ExamQuestion> oldExamQuestions) {
		this.oldExamSource = oldExamSource;
		this.oldExamDate = oldExamDate;
		this.nrOfQuestions = nrOfQuestions;
		this.oldExamQuestions = oldExamQuestions;
	}

	public String getOldExamSource() {
		return oldExamSource;
	}

	public void setOldExamSource(String oldExamSource) {
		this.oldExamSource = oldExamSource;
	}

	public int getOldExamNr() {
		return oldExamNr;
	}

	public void setOldExamNr(int oldExamNr) {
		this.oldExamNr = oldExamNr;
	}

	public LocalDate getOldExamDate() {
		return oldExamDate;
	}

	public void setOldExamDate(LocalDate oldExamDate) {
		this.oldExamDate = oldExamDate;
	}

	public int getNrOfQuestions() {
		return nrOfQuestions;
	}

	public void setNrOfQuestions(int nrOfQuestions) {
		this.nrOfQuestions = nrOfQuestions;
	}

	public ArrayList<ExamQuestion> getOldExamQuestions() {
		return oldExamQuestions;
	}

	public void setOldExamQuestions(ArrayList<ExamQuestion> oldExamQuestions) {
		this.oldExamQuestions = oldExamQuestions;
	}

}
