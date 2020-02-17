package ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import contacts.Contact;

public interface TabList {
	
	DefaultListModel<Contact> model = new DefaultListModel<Contact>();
	JPanel panel = new JPanel();
	JList<Contact> list = new JList<Contact>(model);
	JScrollPane scroll = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JButton removeButton = new JButton("Remove Contact");
	
	public default Component getTabList() {
		
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				GUI.cb.removeContact(list.getSelectedIndex());
						model.clear();
						model.addAll(GUI.cb.contacts);
						try {
							GUI.f.save();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
//						finally {
//							//här uppdateras listan
//						}
				};
			});
		model.addAll(GUI.cb.contacts);
		list.setVisible(true);
		panel.add(scroll);
		panel.add(removeButton);
		panel.setLayout(new GridLayout(2, 1));
		
		return panel;
		
	}
}
