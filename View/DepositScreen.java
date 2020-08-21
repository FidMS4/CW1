package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Model.ATM;

public class DepositScreen implements ActionListener {

	private JFrame window;
	private ATM atm = new ATM(0.0);
	private JTextArea textArea = new JTextArea("Balance: $" + atm.getBalance());
	private JButton zero = new JButton("0");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton mainMenu = new JButton("Main Menu");
	private JButton deposit = new JButton("DEPOSIT");
	private JButton clear = new JButton("c");
	private JTextArea message = new JTextArea("Enter amount to deposit: $");
	private JTextField numField = new JTextField(8);

	public DepositScreen(JFrame window) {
		this.window = window;
		window.setTitle("Deposit");
	}

	public void start() {
		Container cp = window.getContentPane();
		var scrollPane = new JScrollPane(message, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 375));
		cp.add(BorderLayout.CENTER, scrollPane);
		deposit.setToolTipText("Deposit any amount!");
		numField.setEditable(false);
		numField.setToolTipText("Can only input from buttons.");
		cp.add(BorderLayout.NORTH, textArea);

		JPanel functs = new JPanel();
		cp.add(BorderLayout.EAST, functs);
		functs.setLayout(new GridLayout(3, 1));

		JPanel depRow = new JPanel();
		depRow.add(deposit);
		functs.add(depRow);

		JPanel exitRow = new JPanel();
		exitRow.add(mainMenu);
		functs.add(exitRow);

		JPanel clearRow = new JPanel();
		clearRow.add(clear);
		functs.add(clearRow);

		JPanel numberArea = new JPanel();
		cp.add(BorderLayout.CENTER, numberArea);
		numberArea.setLayout(new GridLayout(5, 3));

		JPanel row1 = new JPanel();
		row1.add(message);
		row1.add(numField);
		numberArea.add(row1);

		JPanel row2 = new JPanel();
		row2.add(one);
		row2.add(two);
		row2.add(three);
		numberArea.add(row2);

		JPanel row3 = new JPanel();
		row3.add(four);
		row3.add(five);
		row3.add(six);
		numberArea.add(row3);

		JPanel row4 = new JPanel();
		row4.add(seven);
		row4.add(eight);
		row4.add(nine);
		numberArea.add(row4);

		JPanel row5 = new JPanel();
		row4.add(zero);
		numberArea.add(row5);

		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		mainMenu.addActionListener(this);
		deposit.addActionListener(this);
		clear.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String numbers = numField.getText();

		if (e.getSource() == zero) {
			numField.setText(numbers + "0" );
		} else if (e.getSource() == one) {
			numField.setText(numbers + "1" );
		} else if (e.getSource() == two) {
			numField.setText(numbers + "2" );
		} else if (e.getSource() == three) {
			numField.setText(numbers + "3" );
		} else if (e.getSource() == four) {
			numField.setText(numbers + "4" );
		} else if (e.getSource() == five) {
			numField.setText(numbers + "5" );
		} else if (e.getSource() == six) {
			numField.setText(numbers + "6" );
		} else if (e.getSource() == seven) {
			numField.setText(numbers + "7" );
		} else if (e.getSource() == eight) {
			numField.setText(numbers + "8" );
		} else if (e.getSource() == nine) {
			numField.setText(numbers + "9" );
		} else if (e.getSource() == clear) {
			numField.setText("");

		} else if (e.getSource() == deposit) {
			double newAmount = Double.parseDouble(numbers); 
			atm.deposit(newAmount);
			numField.setText("");
			textArea.setText("Deposited: $" + newAmount);
			
		} else if (e.getSource() == mainMenu) {
			window.getContentPane().removeAll();
			var mainMenu = new AtmSimulator(window);
			mainMenu.start();
			window.pack();
			window.revalidate();
		}
	}
}