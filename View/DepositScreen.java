package View;

import java.awt.*;
import javax.swing.*;

public class DepositScreen {

	private JFrame window;
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
	private JTextArea message = new JTextArea("Enter amount to deposit: $");
	private JTextField numField = new JTextField(10);

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

		JPanel numberArea = new JPanel();
		cp.add(BorderLayout.SOUTH, numberArea);

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

		// atmButton.setToolTipText("Deposit any amount!");
		// panel.add(atmButton);

		// atm.addActionListener( e -> {
		// 	window.getContentPane().removeAll();
		// 	var atm = new AtmSimulator(window);
		// 	atm.start();
		// 	window.pack();
		// 	window.revalidate();
		// });
	}
}