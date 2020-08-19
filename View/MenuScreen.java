package View;

import java.awt.*;
import javax.swing.*;

public class MenuScreen {

	private JFrame window;

	public MenuScreen(JFrame window) {
		this.window = window;
		window.setTitle("Welcome to my ATM Simulator!");
	}

	public void start() {
		Container cp = window.getContentPane();
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 225));
		panel.setBackground(Color.orange);
	
		JButton atmButton = new JButton("ATM Simulator");
		atmButton.setPreferredSize(new Dimension(400, 150));
		atmButton.setToolTipText("Withdraw or Deposit!");
		JTextArea info = new JTextArea("by Fidel Munoz");
		panel.add(atmButton);
		panel.add(info);
		cp.add(BorderLayout.CENTER, panel);

		atmButton.addActionListener( e -> {
			window.getContentPane().removeAll();
			var atm = new AtmSimulator(window);
			atm.start();
			window.pack();
			window.revalidate();
		});
	}
}
