package Inheritence_Assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bank 
{
	ArrayList<Account> accounts;

	Bank()
	{
		accounts=new ArrayList<Account>();
	}
	boolean addAccount(Account acc)
	{
		if(accounts.isEmpty()==false) {
			for(int i=0;i<accounts.size();i++)
			{
				if(accounts.get(i).getAccountId()==acc.getAccountId())
				{
					return false;	
				}

			}
		}
		accounts.add(acc);
		return true;
	}


	double deposite(int accountId,double depositeAmount)
	{
		//Account acc=new SavingAccount();
		for(int i=0;i<accounts.size();i++)
		{
			if(accountId==accounts.get(i).getAccountId())
			{
				double newBalance=accounts.get(i).getBalance()+depositeAmount;
				return newBalance;
			}
		}

		return -1;
	}
	double withdraw(int accountId,double withdrawAmount) throws OutOfBalanceException 
	{
		for(int i=0;i<accounts.size();i++)
		{
			if(accountId==accounts.get(i).getAccountId() && withdrawAmount<=accounts.get(i).getBalance())
			{
				double newBalance=accounts.get(i).getBalance()-withdrawAmount;
				return newBalance;
			}

			else if(accountId==accounts.get(i).getAccountId() && withdrawAmount>accounts.get(i).getBalance())

			{
				throw new OutOfBalanceException(accounts.get(i).getBalance(),withdrawAmount);

			}
		}
		return -1;

	}

	Set<Integer> getUniqueCustomerIds()
	{
		Set<Integer> customerId=new HashSet<Integer>();
		for(int i=0;i<accounts.size();i++)
		{
			customerId.add(accounts.get(i).getCustomerId());
		}
		return customerId;
	}
	HashMap<Integer,Account> getAccountHashMap()
	{
		HashMap<Integer,Account> map=new HashMap<>();
		for(int i=0;i<accounts.size();i++)
		{
			map.put(accounts.get(i).getAccountId(), accounts.get(i));
		}
		return map;
	}
}
