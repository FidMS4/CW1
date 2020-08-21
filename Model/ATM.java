package Model;

public class ATM {

	private double balance;
	public static final double FEE = 3.00;

	public ATM(double initAmount) {
		balance = initAmount;
	}

	public void deposit(double dep) {
		balance += dep;

	}

	public void withdraw(double wit) {
		balance -= wit;
		balance -= FEE;
	}

	//need to only remove fee if deposited or withdrawn but ONCE unless two trans

	public double getBalance() {
		return balance;
	}

}