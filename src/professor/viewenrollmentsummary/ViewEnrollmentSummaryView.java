package professor.viewenrollmentsummary;

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
import javax.swing.JTextField;

public class ViewEnrollmentSummaryView extends JFrame{
	private JLabel lbCrn = new JLabel("Enter CRN:");
	private JTextField _Crn = new JTextField(5);
	private JButton btCrn = new JButton("Get Students Enrolled");
	private JPanel panel;

	
	
	public ViewEnrollmentSummaryView(){
		this.setTitle("View Enrollment");
		this.setLayout(new FlowLayout());
	
		panel = new JPanel();

		this.setSize(1000, 200);
		
	    
	    
		panel.add(lbCrn);
		panel.add(_Crn);
		panel.add(btCrn);

		this.add(panel);
		
	}
	
	public void addJTable(String[][] data){
		String[] columns = {"First Name","Last Name","User Id"};
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
	public int getCrn(){
		return Integer.parseInt(_Crn.getText());
	}
	
	public void addGetCourseListener(ActionListener listenForGetCourse){
		btCrn.addActionListener(listenForGetCourse);
	}
}
