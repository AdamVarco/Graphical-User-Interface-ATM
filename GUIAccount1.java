//Author Adam Varco
import java.awt.Graphics;


import java.awt.GridLayout;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class GUIAccount1 extends JFrame {
	// public static Object a1;
	
	//ArrayList to create an arraylist of Accountss
	Account a1 = new Account();
	ArrayList<Account> A = new ArrayList<Account>();
	
	//A button to login
	JButton Login = new JButton("Login");
	
	//A textfield for the account
	JTextField account = new JTextField();
	//add(Login)
	
	// String string =JOptionPane.showInputDialog(null," the Account ID is");
	// int accountID = Integer.parseInt(string);
	//boolean inputnotOk = true;
	
	int accountID ;

	

	// boolean inputnotOk=true;
	public GUIAccount1() {
		
		for (int index = 0; index < 10; index++)
		{
			A.add(new Account(index, 100));
		}
		
		//sets the layout to  a gridlayout
		setLayout(new GridLayout(2,2,2,2));
		add(new ImagePanel());

		add(new JLabel(" Account ID:"));

		//JTextField account = new JTextField();
		//int c = Integer.parseInt(account.toString());
		//A.get(c);
		add(account);
		add(Login);
		//Login adding ActionListener
		Login.addActionListener(new atmLogin());
		
		// String accountID=JOptionPane.showInputDialog(a1, "Type accountID");
		// JOptionPane.showMessageDialog(null, accountID);

		// ((AbstractButton)add(new JButton("AccountID"))).addActionListener(new
		// atmAccount());
		
		//Buttons that add ActionListeners and their classes
		((AbstractButton) add(new JButton("Deposit")))
				.addActionListener(new atmDeposit());
		((AbstractButton) add(new JButton("Withdraw")))
				.addActionListener(new atmWithdraw());
		((AbstractButton) add(new JButton("Check Balance")))
				.addActionListener(new atmBalance());

	}
	
	public void getAccount() {

		
		accountID = Integer.parseInt(account.getText());
		
		
	
		// ArrayList accountList = new ArrayList();

		/*for (int index = 0; index < 10; index++) {

			A.add(new Account(index, 100));
		}*/
	}

	// JButton source =(JButton)e.getSource();
	// JOptionPane.showMessageDialog(null, "You entered " +source.getText())


	class atmLogin implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//account.getText();
			 int i = Integer.parseInt(account.getText().trim());
			 if(i>=0||i<=9){
				 JOptionPane.showMessageDialog(null, "You are loged in");
			getAccount();
			 }
			 else{
				 JOptionPane.showMessageDialog(null, "Type a number between 0 and 9");
			 }
	}
	}


	class atmBalance implements ActionListener {
		public void actionPerformed(ActionEvent e)

		{
			// int balance= Integer.parseInt();
			// for(int i = 0; i< A.size(); i++){
			// Account x =(Account)A.a1.getBalance();
			// String balance=("The balance is" + A.get(i).getBalance());

			JOptionPane.showMessageDialog(null, "The balance is $"
					+ A.get(accountID).getBalance());

		}
	}

	class atmDeposit implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String string1 = JOptionPane
					.showInputDialog("Enter an amount to deposit:");
			int deposit = Integer.parseInt(string1);
			try{
			a1.deposit(deposit);
			} catch (IllegalArgumentException d) {
			JOptionPane.showMessageDialog(null, "Cannot be less than zero");
		}
			
			//try {
				// int deposit = Integer.parseInt(string1);

				//if (deposit < 0)
					//throw new InsuficientFundsException(
							//"Cannot be less than zero");
				//else
					//A.get(accountID)
					//.setBalance(A.get(accountID).getBalance() + deposit);
			//} catch (InsuficientFundsException d) {
				//JOptionPane.showMessageDialog(null, "Cannot be less than zero");
			//}

			// GUIAccount.array[1].setBalance(deposit);

			// GUIAccount1.a1.setBalance(GUIAccount1.a1.getBalance() + deposit);
			

			JOptionPane.showMessageDialog(null, "The balance is $"
					+ A.get(accountID).getBalance());

		}

	}


//A Withdraw class that makes withdraws
class atmWithdraw implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String string2 = JOptionPane
				.showInputDialog("Enter an amount to withdraw");
	
		int w = Integer.parseInt(string2);
		try {
			a1.withdraw(w);
		} catch (IllegalArgumentException e1) {
			//throw new InsuficientFundsException(
			JOptionPane.showMessageDialog(null,
					"Cannot be greater than the balance");
			e1.printStackTrace();
		} catch (InsuficientFundsException e1) {
			JOptionPane.showMessageDialog(null,
			"Withdraw cannot be greater than the balance or less than or equal to 0");
			e1.printStackTrace();
		}

	//exceptions that are tryied and caught
		//try {
			//if (withdraw > A.get(accountID).getBalance() || withdraw <= 0 )
				//throw new InsuficientFundsException(
						//"Cannot be greater than the balance");
			//else
			//	A.get(accountID).setBalance(A.get(accountID).getBalance() - withdraw);
		//} catch (InsuficientFundsException w1) {

			//JOptionPane.showMessageDialog(null,
					//"Withdraw cannot be greater than the balance or less than or equal to 0");
		//}
		//try{
			//if(withdraw<0)
				//throw new IllegalArgumentException("Cannot be greater than the balance");
		//}catch(IllegalArgumentException w2){
			//JOptionPane.showMessageDialog(null, "Withdraw cannot be less than 0");
		//}
	
		
		
			//A.get(accountID).setBalance(A.get(accountID).getBalance() - withdraw);

		
		JOptionPane.showMessageDialog(null, "The balance is $"
				+ A.get(accountID).getBalance());

	}

}
}
//An Image Icon that is the logo for the bank
class ImagePanel extends JPanel {
	ImageIcon imageIcon = new ImageIcon("C:/Users/Adam/Pictures/Liberty.gif");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}

}
