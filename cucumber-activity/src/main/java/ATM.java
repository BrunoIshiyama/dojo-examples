
public class ATM {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public boolean requestMoney(Account ac, double value) {
		if (ac.getBalance() >= value) {
			ac.setBalance((int) (ac.getBalance() - value));
			return true;
		}
		return false;
	}

	public boolean dispense(double value) {
		if (getBalance() >= value) {
			setBalance(getBalance() - value);
			return true;
		}
		return false;
	}

	public boolean removeCard() {
		return true;
	}

	public void setBalance(Double double1) {
		balance = double1;
	}
}
