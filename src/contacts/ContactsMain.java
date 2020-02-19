package contacts;

import java.io.IOException;

import ui.GUI;

public class ContactsMain {

	public static void main(String[] args) throws IOException {
		GUI.f.FileCheck();
		GUI.f.Load();
		GUI.cb.runGUI();
		GUI.f.save();
		//Loadmetoden startas, som laddar in alla kontakter i .txt filen.
		//runGUImetoden startas, som starar det grafiska användargränssnittet.
		//savemetoden startas, som säkerställer att ändringar i applikationen sparas till .txtfilen.
	}
}
