package inheritence_Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import Inheritence_Assignment2.Account;

public class Inventory {
	ArrayList<Connection> connection;

	Inventory()
	{
		connection=new ArrayList<Connection>();
	}
	boolean addConnection(Connection con)
	{
		for(int i=0;i<connection.size();i++)
		{
		if(connection.get(i).getConnectionId()==con.getConnectionId())
		{
		
		return false;
		}
		}
		connection.add(con);
		return true;
	}
	double recharge(int connectionId,double rechargeAmount)
	{
		for(int i=0;i<connection.size();i++)
		{
		if(connectionId==connection.get(i).getConnectionId())
		{
		double newBalance=connection.get(i).getBalance()+rechargeAmount;
			return newBalance;
		}
		}
		
		return -1;
	}
	double deduct(int connectionId,double deductAmount)throws ConnectionLockedException
	{
		for(int i=0;i<connection.size();i++)
		{
		if(connectionId==connection.get(i).getConnectionId() && connection.get(i).getBalance()>=0)
		{
		double newBalance=connection.get(i).getBalance()-deductAmount;
			return newBalance;
		}
		else if(connectionId==connection.get(i).getConnectionId() && connection.get(i).getBalance()<0)
		{
			throw new ConnectionLockedException(connection.get(i).getBalance());
		}
		}
		return -1;
	}
	
	Set<Integer> getUniqueCustomerIds()
	{
		Set<Integer> customerId=new HashSet<Integer>();
		for(int i=0;i<connection.size();i++)
		{
		customerId.add(connection.get(i).getCustomerId());
		}
		return customerId;
	}
	HashMap<Integer,Connection> getAccountHashMap()
	{
		HashMap<Integer,Connection> map=new HashMap<>();
		for(int i=0;i<connection.size();i++)
		{
		map.put(connection.get(i).getConnectionId(), connection.get(i));
		}
		return map;
	}
}
