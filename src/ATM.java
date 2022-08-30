
import java.util.*;

public class ATM {
	
	private static HashMap<Integer, Double> accounts;
//	private static double balance;
	
	public static void main (String[]args) {
		ATM machine = new ATM();
		machine.openAccount(8);
		machine.openAccount(1, 10.0);
		System.out.println(machine.checkBalance(8));
		System.out.println(machine.checkBalance(1));
		machine.depositMoney(8, 100.0);
		machine.withdrawMoney(1, 2.0);
		System.out.println(machine.checkBalance(8));
		System.out.println(machine.checkBalance(1));
	}
	
	public ATM() {
		accounts = new HashMap<Integer, Double>();
	}
	
	public void openAccount(int num) {
		accounts.put(num, 0.0);
	}
	
	public void openAccount(int num, double dep) {
		accounts.put(num, dep);
	}
	
	public void closeAccount(int num) {
		if (accounts.get(num) == 0)
			accounts.remove(num);
	}
	
	public double checkBalance(int num) {
		if (!accounts.containsKey(num))
			return 0.0;
		return accounts.get(num);
	}
	
	public boolean depositMoney(int num, double dep) {
		if (!accounts.containsKey(num))
			return false;
		accounts.put(num, accounts.get(num) + dep);
		return true;
	}
	
	public boolean withdrawMoney(int num, double wd) {
		if (!accounts.containsKey(num))
			return false;
		accounts.put(num, accounts.get(num) - wd);
		return true;
	}
}
