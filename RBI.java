package capgemini.bank.rbi;

import java.util.Scanner;

public class RBI {
	double addInterest,withdrawInterest,minBalance,Balance;
	int addCounter,withdrawCounter;
	Scanner scan=new Scanner(System.in);
	
	public void displayBalance() {
		System.out.println("Your balance is:"+getBalance());
	}
	public void addAmount() {
		
	}
	public void withdrawAmount() {
		
	}
	public double getAddInterest() {
		return addInterest;
	}
	public void setAddInterest(double addInterest) {
		this.addInterest = addInterest;
	}
	public double getWithdrawInterest() {
		return withdrawInterest;
	}
	public void setWithdrawInterest(double withdrawInterest) {
		this.withdrawInterest = withdrawInterest;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getAddCounter() {
		return addCounter;
	}
	public void setAddCounter(int addCounter) {
		this.addCounter = addCounter;
	}
	public int getWithdrawCounter() {
		return withdrawCounter;
	}
	public void setWithdrawCounter(int withdrawCounter) {
		this.withdrawCounter = withdrawCounter;
	}
	
}
