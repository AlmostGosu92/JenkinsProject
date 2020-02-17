package ui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import contacts.ContactBook;
import contacts.ContactBookSearch;
import filesync.Filesync;

public interface GUI extends TabList, TabSearch, TabAdd {
	
	Filesync f = new Filesync();
	ContactBook cb = new ContactBook();
	ContactBookSearch cbs = new ContactBookSearch();
	
	public default void runGUI() {
		
		JFrame frame = new JFrame("Contactbook");
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		Component tab1 = getTabList();
		Component tab2 = getTabAdd();
		Component tab3 = getTabSearch();
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1,1));
		
		tab1.setName("Contactlist");
		tab2.setName("Add Contact");
		tab3.setName("Search Contact");
		
		tabs.add(tab1);
		tabs.add(tab2);
		tabs.add(tab3);
		
		frame.getContentPane().add(tabs);
		
	}

}
