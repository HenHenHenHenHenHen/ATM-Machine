
public class ATMMachineTester {

	public static void main(String[] args) {
		ATMMachine a = new ATMMachine ();
		a.openAccount(1, 5.0);
		a.openAccount(9, 0.0);
		a.depositMoney(9, 3.5);
		a.depositMoney(9, 4.0);
		a.withdrawMoney(9, 7.0);
		System.out.println (a.checkBalance(9));

	}

}
