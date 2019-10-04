/*
 *Blueprint for the Person object 
 */
public class Person {
	
	private String name, order, paymentType;
	private boolean paidByCash, paidByCredit, alreadyPaid;
	
	public Person() {}
	
	public Person(String name, String order, String paymentType) {
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
		this.order = order;
		if(alreadyPaid) {
			System.err.println(name+" has already paid by "+paymentType);
		}
		else {
			if(paymentType.equalsIgnoreCase("cash")) {
				paidByCash = true;
				alreadyPaid = true;
				this.paymentType = paymentType;
			}
			else if(paymentType.equalsIgnoreCase("credit")) {
				paidByCredit = true;
				alreadyPaid = true;
				this.paymentType = paymentType + " card";
			}
			else {
				System.err.println("Invalid payment type, must be cash or credit\n");
			}
		}
	}//end Person
	
	public void setName(String name) {
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
	}//end setName
	
	public void setOrder(String order) {
		this.order = order;
	}//end setOrder
	
	public String getName() {
		return name;
	}//end getName
	
	public String getOrder() {
		return order;
	}//end getOrder
	
	public void payCash() {
		if(alreadyPaid) {
			System.err.println(name+" has already paid by credit card \n");
		}
		else {
			paidByCash = true;
			alreadyPaid = true;
			paymentType = "cash";
		}
	}//end payCash
	
	public void payCredit() {
		if(alreadyPaid) {
			System.err.println(name+" has already paid by cash \n");
		}
		else {
			paidByCredit = true;
			alreadyPaid = true;
			paymentType = "credit card";
		}
	}//end payCredit
	
	public String toString() {
		return name+" ordered "+order+" and paid by "+paymentType;
	}

}//end class
