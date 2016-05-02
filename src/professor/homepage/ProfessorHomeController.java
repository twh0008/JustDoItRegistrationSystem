package Professor.homepage;

import javax.swing.JButton;

import support.Professor;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

public class ProfessorHomeController {
	private ProfessorView professorView;
	private Professor user;

	public ProfessorHomeController(ProfessorView professorView, Professor user) {
		this.professorView = professorView;
		this.user = user;
		
		this.professorView.addViewEnrollmentSummary(new ViewEnrollmentSummaryListener(user));
		this.professorView.addViewSchedule(new ViewPScheduleListener(user));
		this.professorView.addEnterGrades(new EnterGradesListener(user));
	}
	
	
	
	
	
}
