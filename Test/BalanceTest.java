package Test;

import Model.ATM;

public class BalanceTest {
	public static void main(String args[]) {

		ATM b1 = new ATM();

		b1.deposit(644.12);

		b1.deposit(123.46);
		assert(b1.getBalance() == 644.12 + 123.46);
		
		b1.withdraw(60.00); // includes the withdraw fee
		assert(b1.getBalance() == 704.58);

	}
}