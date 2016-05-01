package professor.homepage;

import javax.swing.JButton;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

public class ProfessorHomeController {
	private ProfessorView professorView;

	public ProfessorHomeController(ProfessorView professorView) {
		this.professorView = professorView;
		
		this.professorView.addViewEnrollmentSummary(new ViewEnrollmentSummaryListener());
		this.professorView.addViewSchedule(new ViewPScheduleListener());
		this.professorView.addEnterGrades(new EnterGradesListener());
	}
	
	
	
	
	
}
