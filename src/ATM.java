
import java.util.*;
<<<<<<< HEAD
import java.text.DecimalFormat;
=======
>>>>>>> main

public class ATM {
	
	private static HashMap<Integer, Double> accounts;
//	private static double balance;
<<<<<<< HEAD
	private static final DecimalFormat df = new DecimalFormat("0.00");
=======
>>>>>>> main
	
	public static void main (String[]args) {
		ATM machine = new ATM();
		machine.openAccount(8);
<<<<<<< HEAD
		machine.openAccount(1, 10.00);
		System.out.println(machine.checkBalance(8)); //0.0
		System.out.println(machine.checkBalance(1)); //10.00
		machine.depositMoney(8, 100.00);
		machine.depositMoney(1, 69.69);
		System.out.println(machine.checkBalance(8)); //100.00
		System.out.println(machine.checkBalance(1)); //79.69
		machine.withdrawMoney(8, 99.00);
		machine.withdrawMoney(8, 0.99);
		System.out.println(machine.checkBalance(8)); //0.01
		machine.depositMoney(8, -100.00);
		System.out.println(machine.checkBalance(8)); //0.01
		machine.withdrawMoney(8, -100.00);
		machine.withdrawMoney(8, 6969.69);
		System.out.println(machine.checkBalance(8)); //0.01
		machine.depositMoney(5, 5.00);
		machine.withdrawMoney(5, 5.00);
		System.out.println(machine.checkBalance(5)); //0.00
=======
		machine.openAccount(1, 10.0);
		System.out.println(machine.checkBalance(8));
		System.out.println(machine.checkBalance(1));
		machine.depositMoney(8, 100.0);
		machine.withdrawMoney(1, 2.0);
		System.out.println(machine.checkBalance(8));
		System.out.println(machine.checkBalance(1));
>>>>>>> main
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
<<<<<<< HEAD
		String decimal = df.format(accounts.get(num));
		return Double.parseDouble(decimal);
=======
		return accounts.get(num);
>>>>>>> main
	}
	
	public boolean depositMoney(int num, double dep) {
		if (!accounts.containsKey(num))
			return false;
<<<<<<< HEAD
		if (dep < 0)
			return false;
=======
>>>>>>> main
		accounts.put(num, accounts.get(num) + dep);
		return true;
	}
	
	public boolean withdrawMoney(int num, double wd) {
		if (!accounts.containsKey(num))
			return false;
<<<<<<< HEAD
		if (wd < 0)
			return false;
		if (wd > accounts.get(num))
			return false;
=======
>>>>>>> main
		accounts.put(num, accounts.get(num) - wd);
		return true;
	}
}
