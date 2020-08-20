package View;

import java.awt.*;
import javax.swing.*;

import Controller.ButtonClickListener;
import Model.ATM;

public class AtmSimulator {

	private ATM atm = new ATM(0.00);
	private JFrame window;

	private JTextArea textArea = new JTextArea("Balance: $" + atm.getBalance());

	private JButton deposit = new JButton("Deposit");
	private JButton withdraw = new JButton("Withdraw");
	private JButton exit = new JButton("Exit");

	public AtmSimulator(JFrame window) {
		this.window = window;
		window.setTitle("Main Menu");
	}

	public void start() {
		Container cp = window.getContentPane();
		var scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		cp.add(BorderLayout.CENTER, scrollPane);
		textArea.setEditable(false);

		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(375, 200));
		cp.add(BorderLayout.CENTER, mainPanel);
		mainPanel.setLayout(new GridLayout(3, 1));

		//first screen
		JPanel row1 = new JPanel();
		row1.add(textArea);
		mainPanel.add(row1);

		JPanel row2 = new JPanel();
		row2.add(deposit);
		row2.add(withdraw);
		mainPanel.add(row2);

		JPanel row3 = new JPanel();
		row3.add(exit);
		mainPanel.add(row3);

		ButtonClickListener bcl = new ButtonClickListener(this);
		deposit.addActionListener(bcl);
		withdraw.addActionListener(bcl);
	
		exit.addActionListener(e -> {
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.start();
			window.pack();
			window.revalidate();
		});

	}

	public JButton getDButton() {
		return deposit;
	}

	public JButton getWButton() {
		return withdraw;
	}

	public JButton getExitButton() {
		return exit;
	}

	public JFrame getWindow() {
		return window;
	}

	public ATM getATM() {
		return atm;
	} 

	public JTextArea getDisplay() {
		return textArea;
	}


}