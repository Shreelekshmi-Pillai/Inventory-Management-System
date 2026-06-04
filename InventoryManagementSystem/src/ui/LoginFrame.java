/**
 * 
 */
package ui;

import javax.swing.*;
import service.LoginService;

public class LoginFrame extends JFrame{
	 
	JLabel lblUser,lblPass;
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnLogin ,btnExit;
	
	
	public  LoginFrame() {
		setTitle("INVENTORY MANAGEMENT SYSTEM");
		setSize(400,300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblUser = new JLabel("USERNAME");
		lblUser.setBounds(50,50,100,30);
		
		txtUser =new JTextField();
		txtUser.setBounds(150,50,150,30);
		
		lblPass=new JLabel("PASSWORD");
		lblPass.setBounds(50,100,100,30);
		
		txtPass= new JPasswordField();
		txtPass.setBounds(150,100,150,30);
		
		btnLogin=new JButton("LOGIN");
		btnLogin.setBounds(80,180,100,30);
		
		btnExit= new JButton("EXIT");
		btnExit.setBounds(200,180,100,30);
		
		add(lblUser);
		add(txtUser);
		add(lblPass);
		add(txtPass);
		add(btnLogin);
		add(btnExit);
		
		setVisible(true);
	
		
		}
	public static void main(String[] args) {
		new LoginFrame();
		
	}

}
