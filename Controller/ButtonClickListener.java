package Controller;

import java.awt.event.*;
import javax.swing.*;

import View.AtmSimulator;
import View.MenuScreen;

public class ButtonClickListener implements ActionListener {

	private AtmSimulator panel;

	public ButtonClickListener(AtmSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var button = e.getSource();
		String m = panel.getDisplay().getText() + "\n";
		if (button == panel.getExitButton()) {
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.start();
			window.pack();
			window.revalidate();
		} else if (button == panel.getDButton()) { 
			
		} else if (button == panel.getWButton()) {
			panel.getDisplay().setText(m + "Result = " + panel.getATM().getBalance());
		} 
	}
	
}