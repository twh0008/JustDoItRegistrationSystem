package student.viewgrades;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewGradesView extends JFrame{


	private JLabel lbStatus = new JLabel("Your Grades:");
	private JButton btGetGrades = new JButton("Get Grades");
	private JPanel panel;

	
	
	public ViewGradesView(){
		this.setTitle("View Grades");
		this.setLayout(new FlowLayout());
	
		panel = new JPanel();

		this.setSize(800, 200);
		panel.add(lbStatus);
		panel.add(btGetGrades);

		this.add(panel);
		
	}
	
	public void addJTable(String[][] data){
		String[] columns = {"Course", "Grade"};
		JPanel newPanel = new JPanel();
		JTable tbGrades = new JTable(data, columns){
			public boolean isCellEditable(int x, int y){
				return false;
			}
		};
		tbGrades.setPreferredScrollableViewportSize(new Dimension(450, 52));
		tbGrades.setFillsViewportHeight(true);
		
		JScrollPane sp = new JScrollPane(tbGrades);
		newPanel.add(sp);
		
		this.getContentPane().removeAll();
		this.getContentPane().add(newPanel);
		this.repaint();
		this.add(newPanel);
		this.printAll(getGraphics());
	
		
	}
	
	public void addGetGradesListener(ActionListener listenForGetGrades){
		btGetGrades.addActionListener(listenForGetGrades);
	}
	
	
	
	public void displayError(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}
}
