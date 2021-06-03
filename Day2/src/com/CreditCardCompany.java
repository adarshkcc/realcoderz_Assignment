package com;

public class CreditCardCompany {
	
public double getPaybackAmount(Customer c)
{
	double paybackAmount;
	if(c.getCreditCardCharges()<=500)
		return paybackAmount=(c.getCreditCardCharges()-(0.25*c.getCreditCardCharges())/100);


else if((c.getCreditCardCharges()>500) && (c.getCreditCardCharges()<=1500))
	return paybackAmount=(c.getCreditCardCharges()-(0.50*c.getCreditCardCharges())/100);


else if((c.getCreditCardCharges()>1500) && (c.getCreditCardCharges()<=2500))
	return paybackAmount=(c.getCreditCardCharges()-(0.75*c.getCreditCardCharges())/100);

else
	return paybackAmount=(c.getCreditCardCharges()-(1*c.getCreditCardCharges())/100);
	
}
}