import java.util.ArrayList;
import java.util.Date;

// JA: This does not compile
class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<transaction> Transactions;

	
	Account() {
		Transactions = new ArrayList<>();
		
	}
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
public void withdraw(double amount) {
       Transactions.add(new Transaction('W', amount, balance, "withdraw"));
        balance -= amount;
    }

    public void deposit(double amount) {
        Transactions.add(new Transaction('D', amount, balance, "deposit"));
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account name: " + id + "\n" + "Interest rate: " + annualInterestRate + "\n" + Transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(Transactions);
    }

}
class CheckingAccount extends Account {
	private static final int OVERDRAFT_LIMIT = 1000;

	
	@Override
	public void withdraw(double amount) {
		if (super.getBalance - amount >= OVERDRAFT_LIMIT)
			super.setBalance(super.getBalance() - amount);
	}
}
class SavingsAccount extends Account {
	
	@Override
	public void withdraw(double amount) {
		if (super.getBalance - amount >= 0)
			super.setBalance(super.getBalance() - amount);
	}
	
}
public class Problem11_3 {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
	
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}


