package ui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import contacts.ContactBook;

public interface UI {
	private void startGUI() {
		JFrame frame = new JFrame("Contactbook");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new GridLayout(1,1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Contactbook", makePanel("Contacts will go here"));
		tabbedPane.addTab("Add Contact", makePanel("Add Contact", " First Name: ", "Last name: ", "Number: ", "E-Mail: "));
		tabbedPane.addTab("Search", makePanel("this is where we search"));
		
		frame.getContentPane().add(tabbedPane);
		
		
	}

	private Component makePanel(String string) {
		JPanel panel = new JPanel();
		panel.add(new JLabel(string));
		panel.setLayout(new FlowLayout());
		panel.setAlignmentX(0);
		return panel;
	}
	
	private Component makePanel(String buttonText, String labelFName, String labelLName, String labelNumber, String labelMail) {
		JPanel panel = new JPanel();
		String fName, lName, mail, number;
		panel.add(new JLabel(labelFName));
		JTextField jtfFname = new JTextField(null, 5);
		JTextField jtfLname = new JTextField(null, 5);
		JTextField jtfMail = new JTextField(null, 5);
		JTextField jtfNumber = new JTextField(null, 5);
		
		JButton addButton = new JButton(buttonText);
		addButton.addActionListener(l ->  ContactBook.addContact(jtfFname.getText(), jtfLname.getText(), jtfMail.getText(), jtfNumber.getText()));

		panel.add(jtfFname);
		panel.add(new JLabel(labelLName));
		panel.add(jtfLname);
		panel.add(new JLabel(labelNumber));
		panel.add(jtfMail);
		panel.add(new JLabel(labelMail));
		panel.add(jtfNumber);
		panel.add(addButton);
		panel.setLayout(new GridLayout(5,2));
		
		return panel;
		
	}
	
	public default void run() {
		startGUI();
	}
}
