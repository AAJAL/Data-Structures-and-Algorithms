import java.util.LinkedList;

public class Queue<T> {
	
	private LinkedList<T> queue = new LinkedList<>();

	public void enqueue(T x){
		queue.addLast(x);
		
	}
	public T dequeue(){
		return queue.removeFirst();
	}
	public boolean contains(T x){
		boolean isPresent = queue.contains(x);
		return isPresent;	
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}

	public T getNode(int i) {
		return queue.get(i);
	}
	public String toString() {
		return queue+"";
	}

}
