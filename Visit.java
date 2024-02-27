package baitapjava71;


import java.util.Date;

  public class Visit extends Customer {
   private Customer customer;
   private Date date;
   private double serviceExpense;
   private double productExpense;
	public Visit(String name,Date date) {
		super(name);
		this.date=date;
		
	}
public String getName() {
		return super.getName();
	}
public double getserviceExpense() {
	return serviceExpense;
}
public void setserviceExpense(double ex ) {
	this.serviceExpense=ex;
}
public double getproductExpense() {
	return productExpense;
	
}
public void setproductExpense(double ex) {
	this.productExpense=ex;
}
public double totalexpense() {
	return serviceExpense+productExpense;
}
@Override
public String toString() {
	return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense="
			+ productExpense + "]";
}
}
