import java.util.HashMap;

public class ATMMachine {
	private HashMap<Integer, Double> accounts;
	
	public ATMMachine () {
		accounts = new HashMap<Integer, Double>();
	}
	
	public void openAccount (int accNo) {
		accounts.putIfAbsent(accNo, 0.0);
	}
	
	public void openAccount (int accNo, double initialDeposit) {
		if (initialDeposit >= 0) {
			accounts.putIfAbsent(accNo, initialDeposit);
		} else {
			accounts.putIfAbsent(accNo, 0.0);
		}
	}
	
	public boolean closeAccount (int accNo) {
		if (accounts.get(accNo) <= 0) {
			accounts.remove(accNo);
			return true;
		}
		return false;
	}
	
	public double checkBalance (int accNo) {
		if (!accounts.containsKey(accNo)) {
			return 0.0;
		} else {
			return accounts.get(accNo);
		}
	}
	
	public boolean depositMoney (int accNo, double deposit) {
		if (deposit >= 0) {
			if (accounts.containsKey(accNo)) {
				accounts.put(accNo, accounts.get(accNo) + deposit);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean withdrawMoney (int accNo, double withdraw) {
		if (withdraw >= 0) {
			if (accounts.containsKey(accNo)) {
				accounts.put(accNo, accounts.get(accNo) - withdraw);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
