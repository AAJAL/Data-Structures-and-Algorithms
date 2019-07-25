
public class QueueDriver {

	public static void main(String[] args) {
		Queue queue = new Queue();
		Queue queue2 = new Queue();
		
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");
		System.out.println(queue.toString());
		
		queue.dequeue();
		System.out.println(queue.toString());
		
		queue2.enqueue("A");
		queue2.enqueue(2);
		queue2.enqueue(5.4);
		queue2.enqueue("String");
		System.out.println("\n"+queue2.toString());
		
		queue2.dequeue();
		System.out.println(queue2.toString());
		
		queue2.dequeue();
		System.out.println(queue2.toString());

	}

}
