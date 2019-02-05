package com.ashu.collection.bankaccount;

public class SavingAccount {

	int accBalance;
	int accId;
	String accountHolderName;
	boolean isSalaryAccount;
	public SavingAccount(int accBalance, int accId, String accountHolderName,
			boolean isSalaryAccount) {
		super();
		this.accBalance = accBalance;
		this.accId = accId;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "SavingAccount [accBalance=" + accBalance + ", accId=" + accId
				+ ", accountHolderName=" + accountHolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
}
