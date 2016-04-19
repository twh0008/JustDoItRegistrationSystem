package reg.views;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LoginView extends JFrame {

	private JTextField _username = new JTextField(10);
	private JPasswordField _password = new JPasswordField(10);
	private JLabel lbPassword = new JLabel("Password");
	private JLabel lbUsername = new JLabel("Username");
	private JButton btLogin = new JButton("Login");
	
	public LoginView(){
		JPanel loginPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);

		loginPanel.add(lbUsername);
		loginPanel.add(_username);
		loginPanel.add(lbPassword);
		loginPanel.add(_password);
		loginPanel.add(btLogin);
		
		this.add(loginPanel);
		
	}
	
	public String getUsername() {
		if(_username.getText().isEmpty()) throw new IllegalArgumentException();
		return _username.getText();
	}
	
	public char[] getPassword() {
		if(_password.getPassword().length == 0) throw new IllegalArgumentException();
		return _password.getPassword();
	}
	
	public void addNewLoginListener(ActionListener listenForLoginButton){
		btLogin.addActionListener(listenForLoginButton);
	}
	
	public void displayError(String message){
		
		JOptionPane.showMessageDialog(this, message, "Login Error", 
									JOptionPane.INFORMATION_MESSAGE);
		
	}


}