package ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public interface UI {
	public static void startGUI() {
		JFrame frame = new JFrame("Test");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new GridLayout(1,1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Tab1", makePanel("This is tab 1"));
		tabbedPane.addTab("Tab2", makePanel("This is tab 2"));
		
		frame.getContentPane().add(tabbedPane);

	}

	private static Component makePanel(String string) {
		JPanel panel = new JPanel();
		panel.add(new Label(string));
		panel.setLayout(new GridLayout(1,1));
		return panel;
	}
	
	public static void run() {
		startGUI();
	}
}
