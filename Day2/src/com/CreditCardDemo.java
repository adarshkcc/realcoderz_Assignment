package com;

public class CreditCardDemo {

	public static void main(String[] args) {
		CreditCardCompany cc=new CreditCardCompany();
		Customer one =new Customer(12,1234,500);
		System.out.println(cc.getPaybackAmount(one));
		
		Customer two =new Customer(12,3456,1500);
		System.out.println(cc.getPaybackAmount(two));
		
		Customer three =new Customer(12,666675435,2000);
		System.out.println(cc.getPaybackAmount(three));
		
		Customer four =new Customer(12,55656,3000);
		System.out.println(cc.getPaybackAmount(four));
		
		Customer five =new Customer(12,345445,5000);
		System.out.println(cc.getPaybackAmount(five));
		
	}

}
