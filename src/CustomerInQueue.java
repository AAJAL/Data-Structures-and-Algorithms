/*
 * This class simulates a line at Starbuck's.
 * It uses the Queue data structure, along with a Person class.
 * The Queue data structure mimics the line.
 */
public class CustomerInQueue {

	public static void main(String[] args) {
		Queue line = new Queue();
		
		Person bill = new Person();
		Person wendy = new Person("wendy", "iced tea", "credit");
		Person joe = new Person("joe", "Pumpkin spice latte", "cash");
		Person john = new Person();
		
		bill.setName("bill");
		bill.setOrder("large coffee");
		bill.payCash();
		bill.payCredit();
		
		john.setName("john");
		john.setOrder("caramel macchiato");
		john.payCredit();
		
		System.out.println(bill.toString());
		System.out.println(wendy.toString());
		System.out.println(joe.toString());
		System.out.println(john.toString());
		
		line.enqueue(bill);
		line.enqueue(wendy);
		line.enqueue(joe);
		line.enqueue(john);
		
		System.out.println(line.toString());

	}//end main

}//end class
