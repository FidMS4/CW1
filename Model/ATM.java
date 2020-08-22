package Model;

public class ATM {

	private double balance;
	public static final double FEE = 3.00;

	public ATM() {
		balance = 0;
	}

	public void deposit(double dep) {
		balance += dep;
	}

	public void withdraw(double wit) {
		balance -= wit;
		balance -= FEE;
	}

	public double getBalance() {
		return balance;
	}

}