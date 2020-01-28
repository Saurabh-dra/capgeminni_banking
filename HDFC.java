package capgemini.bank.rbi;

public class HDFC extends RBI {
	@Override
	public void displayBalance() {
	// TODO Auto-generated method stub
		super.displayBalance();
	}
	@Override
	public void addAmount() {
		// TODO Auto-generated method stub
		super.addAmount();
		setAddCounter(getAddCounter() + 1);
		// setScan(scan.nextInt());
		System.out.println("Enter the amount to add:");
		int amount = scan.nextInt();
		setAddInterest(2.75);
		if (getAddCounter() <= 3) {
			setBalance(getBalance() + amount);
		} else {
			setBalance(getBalance() + amount);
			setBalance(getBalance() + (getAddInterest() * getBalance()) / 100);
		}
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		super.withdrawAmount();
		setWithdrawCounter(getWithdrawCounter()+1);
		System.out.println("Enter the amount to withdraw:");
		int amount=scan.nextInt();
		setWithdrawInterest(2);
		setMinBalance(2000);
		if(getBalance()-amount>=getMinBalance()) 
		{
			if(getWithdrawCounter()<=3) {
				setBalance(getBalance()-amount);
			}
			else {
				setBalance(getBalance()-amount);
				setBalance(getBalance()-(getWithdrawInterest()*getBalance())/100);
			}
		}
		else
			System.out.println("Not Enough Balance");
	}
}
