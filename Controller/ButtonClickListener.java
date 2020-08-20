package Controller;

import java.awt.event.*;
import javax.swing.*;

import View.AtmSimulator;
import View.DepositScreen;

public class ButtonClickListener implements ActionListener {

	private AtmSimulator panel;

	public ButtonClickListener(AtmSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var button = e.getSource();
		String m = panel.getDisplay().getText();

		if (button == panel.getDButton()) { 
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var depositMenu = new DepositScreen(window);
			depositMenu.start();
			window.pack();
			window.revalidate();


		} else if (button == panel.getWButton()) {
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			// var withdrawMenu = new WithdrawScreen(window);
			// withdrawMenu.start();
			window.pack();
			window.revalidate();
		} 
	}
	
}