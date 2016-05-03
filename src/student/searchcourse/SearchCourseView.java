package student.searchcourse;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SearchCourseView extends JFrame {


	private JLabel lbCourses = new JLabel("Select Term:");
	private JButton btGetCourses = new JButton("Get Courses");
	JComboBox termCombo;
	private JPanel panel;

	
	
	public SearchCourseView(){
		this.setTitle("Search Courses");
		this.setLayout(new FlowLayout());
	
		panel = new JPanel();

		this.setSize(1000, 200);
		
		DefaultComboBoxModel terms = new DefaultComboBoxModel();
		terms.addElement("Fall2016");
		terms.addElement("Spring2016");
		terms.addElement("Summer2016");
		termCombo = new JComboBox(terms);    
	    termCombo.setSelectedIndex(0);
	    
	    
		panel.add(lbCourses);
		panel.add(termCombo);
		panel.add(btGetCourses);

		this.add(panel);
		
	}
	
	public void addJTable(String[][] data){
		String[] columns = {"CourseId", "CourseName", "CourseSize", 
							"CourseCap", "Credits","CourseDates","CourseTime"};
		JPanel newPanel = new JPanel();
		JTable tbGrades = new JTable(data, columns){
			public boolean isCellEditable(int x, int y){
				return false;
			}
		};
		tbGrades.setPreferredScrollableViewportSize(new Dimension(900, 52));
		tbGrades.setFillsViewportHeight(true);
		
		JScrollPane sp = new JScrollPane(tbGrades);
		newPanel.add(sp);
		
		this.getContentPane().removeAll();
		this.getContentPane().add(newPanel);
		this.repaint();
		this.add(newPanel);
		this.printAll(getGraphics());
	
		
	}
	public String getSelected(){
		return (String) termCombo.getSelectedItem();
	}
	
	public void addGetCoursesListener(ActionListener listenForGetCourses){
		btGetCourses.addActionListener(listenForGetCourses);
	}
	
	
}
