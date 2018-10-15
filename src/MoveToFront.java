/*************************************************************************
*
*  Pace University
*  Fall 2017
*  Data Structures and Algorithms
*
*  Course: CS 241 CRN 73913
*  Author: Aayan Jalal
*  Collaborators: NONE
* 
*
*  Problem: MoveToFront Class
*  Description: This is the object class that has the methods push, pop, contains, and isEmpty
*
*
*  Visible data fields:
*  LinkedList 
*
*  Visible methods:
*  push, pop, contains, isEmpty
*
*
*   Remarks
*   -------
*
*   PUT ALL NON-CODING ANSWERS HERE
*   LinkedList running time
*	The push method has a running time of O(1)
*	The pop method has a running time of O(1) since you will be removing the first 
*	The contains method has a running time of O(n) since it involves searching
*	The isEmpty method has a running time of O(1) since it is only true if the list is empty
*
*	ArrayList running time
*	The push method has remove which would be O(n). The addFirst would be O(1).
*	The pop method will be O(n)
*	The contains method will be O(n)
*	The isEmpty method will be O(1)
*
*************************************************************************/
import java.util.LinkedList;
public class MoveToFront<T>{
	
	LinkedList<T> stack = new LinkedList<>();
	
public void push(T x){
	stack.remove(x);
	stack.addFirst(x);
	
}
public T pop(){
	return stack.removeFirst();
}
public boolean contains(T x){
	boolean isPresent = stack.contains(x);
	return isPresent;	
	//runtime O(n)
}
public boolean isEmpty(){
	return stack.isEmpty();
}

}//end class
