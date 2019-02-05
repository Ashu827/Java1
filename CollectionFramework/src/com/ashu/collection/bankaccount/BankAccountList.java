package com.ashu.collection.bankaccount;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.ashu.collection.generics.Account;

public class BankAccountList implements Comparator<SavingAccount>{

	public static void main(String[] args) {
		Set<SavingAccount> account=new TreeSet<SavingAccount>(new BankAccountList());
		
		account.add(new SavingAccount(5000, 1234, "Ashutosh", true));
		account.add(new SavingAccount(5000, 12, "Siddhartha", true));
		account.add(new SavingAccount(5000, 123, "Manish", true));
		account.add(new SavingAccount(5000, 12345, "vijay", true));
		account.add(new SavingAccount(5000, 1234, "Ashutosh", true));
		
		for(SavingAccount view:account){
			System.out.println(view);
		}
		
		}
			
			
			

	public int compare(SavingAccount Id1, SavingAccount Id2) {
		if(Id1.getAccId()>Id2.getAccId())
			return 1;
		if(Id1.getAccId()==Id2.getAccId())
			return 0;
		else 
			return -1;
	}

}
