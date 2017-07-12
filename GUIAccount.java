//Author Adam Varco
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class GUIAccount extends JFrame 
{	
	public static void main(String[] args) 
	{	
		GUIAccount1 frame = new GUIAccount1();
		//String accountID =JOptionPane.showInputDialog(frame, "Enter an AccountID");
		//System.out.printf("The user's accountID is '%s'.\n", accountID);
		//System.exit(0);
		frame.setTitle("Bank of Liberty");
		frame.setSize(400, 400);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
