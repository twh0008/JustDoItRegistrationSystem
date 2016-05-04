package registration.login;
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
		super("JustLogIn");
		JPanel loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.gridx = 0;
		constraints.gridy = 0;
		loginPanel.add(lbUsername, constraints);
		
		constraints.gridx = 1;
		loginPanel.add(_username, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		loginPanel.add(lbPassword, constraints);
		
		constraints.gridx = 1;
		loginPanel.add(_password, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		loginPanel.add(btLogin, constraints);
		
		//border
		loginPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Login Panel"));
		
		add(loginPanel);
		pack();
		setLocationRelativeTo(null);
	
		
	}
	
	public String getUsername() {
		if(_username.getText().isEmpty()) throw new IllegalArgumentException();
		return _username.getText();
	}
	
	public char[] getPassword() {
		if(_password.getPassword().length == 0) throw new IllegalArgumentException();
		return _password.getPassword();
	}
	public void clearUsername() {
		_username.setText("");
	}
	
	public void clearPassword() {
		_password.setText("");
	}
	
	public void addNewLoginListener(ActionListener listenForLoginButton){
		btLogin.addActionListener(listenForLoginButton);
	}
	
	public void displayError(String message){
		
		JOptionPane.showMessageDialog(this, message, "Login Error", 
									JOptionPane.INFORMATION_MESSAGE);
		
	}


}