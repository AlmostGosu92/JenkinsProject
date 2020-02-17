package ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface TabAdd {
	
	JPanel panel = new JPanel();
	JTextField fName = new JTextField();
	JTextField lName = new JTextField();
	JTextField number = new JTextField();
	JTextField mail = new JTextField();
	JButton addButton = new JButton("Add Contact");
	JLabel lblFName = new JLabel("First name:");
	JLabel lblLName = new JLabel("Last name:");
	JLabel lblNumber = new JLabel("Number:");
	JLabel lblMail = new JLabel("E-Mail:");
	
	public default Component getTabAdd() {
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				GUI.cb.addContact(fName.getText(), lName.getText(), mail.getText(), number.getText());
						try {
							GUI.f.save();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						finally {
							TabList.model.clear();
							TabList.model.addAll(GUI.cb.contacts);
						}
				};
			});
		panel.add(lblFName);
		panel.add(fName);
		panel.add(lblLName);
		panel.add(lName);
		panel.add(lblNumber);
		panel.add(number);
		panel.add(lblMail);
		panel.add(mail);
		panel.add(addButton);
		panel.setLayout(new GridLayout(5,2));
		
		return panel;
	}

}
