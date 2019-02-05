package spring.aop.bankinterface;

public interface BankAccountService {
	
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
	public double withdraw(long accountId, double balance);

}
