package ui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface TabSearch {

	JPanel panel = new JPanel();
	JTextField search = new JTextField();
	JButton searchButton = new JButton("Search Contact");
	
	public default Component getTabSearch() {
		
		searchButton.addActionListener(l -> search.setText(GUI.cbs.searchContact(search.getText())));
		
		panel.add(search);
		panel.add(searchButton);
		panel.setLayout(new GridLayout(2,1));
		
		return panel;
	}
}
