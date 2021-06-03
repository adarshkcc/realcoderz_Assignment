	package assignmet3;
import java .util.Scanner; 
public class OrderDemo {

	public void storeCustomerData(Order o)
	{
		Customer c=new Customer();
		o.setCustomer(c);
		System.out.println("Enter Customer Id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		c.setCustomerId(id);
		
		
		System.out.println("enter custoer name");
		String name=sc.next();
		c.setCustName(name);
		
		System.out.println("Enter the pin code");
		int pin=sc.nextInt();
		c.setPincode(pin);	
	}
	
	public void storeOrderData(Order o)
	{
		Scanner sc=new Scanner(System.in);
		o.setOrderId(1123);
		o.setOrderType("electronic media");	
	}
	
	public void storeItemData(Order o)
	{
		Item t=new Item();
		o.setItem(t);
		t.setItemId(114);
		t.setItemNo(3);
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the quantity");
		int q=sc.nextInt();
		t.setQuantity(q);
		t.setRate(12000);
		t.setTotal(q*12000);
		
		
	}
	public void showOrderData(Order o)
	{
		System.out.println("cutomer id:"+o.getCustomer().getCustomerId());
		System.out.println("customer name:"+o.getCustomer().getCustName());
		System.out.println("pin code:"+o.getCustomer().getPincode());
		System.out.println("order id:"+o.getOrderId());
		System.out.println("order Type:"+o.getOrderType());
		System.out.println("item Id:"+o.getItem().getItemId());
		System.out.println("item no:"+ o.getItem().getItemNo());
		System.out.println("quantity:"+o.getItem().getQuantity());
		System.out.println("Rate:"+o.getItem().getRate());
		System.out.println("total:"+o.getItem().getTotal());
		
	}
	public static void main(String[] args) {
	
		OrderDemo d=new OrderDemo();
		Order o=new Order();
		d.storeCustomerData(o);
        d.storeOrderData(o);
        d.storeItemData(o);
        d.showOrderData(o);
	}

}
