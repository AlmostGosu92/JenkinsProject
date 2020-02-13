package ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public interface UI {
	private static void startGUI() {
		JFrame frame = new JFrame("Contactbook");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new GridLayout(1,1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Contactbook", makePanel("Contacts will go here"));
		tabbedPane.addTab("Add Contact", makePanel("Add Contact", "Name: ", "Number: ", "E-Mail: "));
		
		frame.getContentPane().add(tabbedPane);
		
		
	}

	private static Component makePanel(String string) {
		JPanel panel = new JPanel();
		panel.add(new Label(string));
		panel.setLayout(new GridLayout(1,1));
		return panel;
	}
	
	private static Component makePanel(String buttonText, String textfieldName, String textfieldNumber, String textfieldMail) {
		JPanel panel = new JPanel();
		panel.add(new Label(textfieldName));
//		panel.add(new JTextField("", 1));
		panel.add(new Label(textfieldNumber));
//		panel.add(new JTextField());
		panel.add(new Label(textfieldMail));
//		panel.add(new JTextField());
		panel.add(new JButton(buttonText));
		panel.setLayout(new GridLayout(4,4));
		return panel;
		
	}
	
	public static void run() {
		startGUI();
	}
}
