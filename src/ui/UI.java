package ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import contacts.ContactBook;
import contacts.ContactBookSearch;
import filesync.Filesync;

public interface UI {
	
	Filesync f = new Filesync();
	ContactBook cb = new ContactBook();
	ContactBookSearch cbs = new ContactBookSearch();
	
	private void startGUI() {
		JFrame frame = new JFrame("Contactbook");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new GridLayout(1,1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Contactbook", makePanelContactList("Remove Contact"));
		tabbedPane.addTab("Add Contact", makePanelAddContact("Add Contact", " First Name: ", "Last name: ", "Number: ", "E-Mail: "));
		tabbedPane.addTab("Search", makePanelSearch("Search Contact"));
		
		frame.getContentPane().add(tabbedPane);
		
		
	}

	private Component makePanelSearch(String string) {
		JPanel panel = new JPanel();
		JTextField jtfSearch = new JTextField();
		JButton searchButton = new JButton(string);
		
		panel.setLayout(new GridLayout(2,1));
		panel.add(jtfSearch);
		panel.add(searchButton);
		searchButton.addActionListener(l -> jtfSearch.setText(cbs.searchContact(jtfSearch.getText())));
		return panel;
	}

	private Component makePanelContactList(String string) {
		JPanel panel = new JPanel();
		JList list = new JList(cb.contacts.toArray());
		JScrollPane scroll = new JScrollPane(list);
		JButton removeButton = new JButton(string);
		
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cb.removeContact(list.getSelectedIndex());
						try {
							f.save();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				};
			});
		
		list.setVisible(true);		
		
		scroll.createVerticalScrollBar();
		
		panel.add(scroll);
		panel.add(removeButton);
		panel.setLayout(new GridLayout(2,1));
		
		return panel;
	}
	
	private Component makePanelAddContact(String buttonText, String labelFName, String labelLName, String labelNumber, String labelMail) {
		JPanel panel = new JPanel();
		JTextField jtfFname = new JTextField(null, 5);
		JTextField jtfLname = new JTextField(null, 5);
		JTextField jtfMail = new JTextField(null, 5);
		JTextField jtfNumber = new JTextField(null, 5);
		
		JButton addButton = new JButton(buttonText);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cb.addContact(jtfFname.getText(), jtfLname.getText(), jtfMail.getText(), jtfNumber.getText());
						try {
							f.save();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
				};
			});
//		addButton.addActionListener(l -> ); //Behöver implementera kod för att updatera JScrollPane i Contactbook tabben

		panel.add(new JLabel(labelFName));
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
