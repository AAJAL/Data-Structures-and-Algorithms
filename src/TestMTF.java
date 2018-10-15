/*************************************************************************
*
*  Pace University
*  Fall 2017
*  Data Structures and Algorithms
*
*  Course: CS 241 CRN 73913
*  Author: Aayan Jalal
*  Collaborators: NONE
*  References: PUT THE LINKS TO YOUR SOURCES HERE
*
*  Assignment: 2
*  Description: Main class that inherits the MoveToFront object
*
*  Input: 
*  		m.push("a");
		m.push("b");
		m.pop(); //Removes b
		m.push("c");
		m.push("d");
		m.push("a");//Puts a on top
*  Output: 
*   a
	d
	c

 	The character is not present
*
*  Visible data fields:
*  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
*
*  Visible methods:
*  COPY SIGNATURE OF VISIBLE METHODS HERE
*
*
*   Remarks
*   -------
*
*   PUT ALL NON-CODING ANSWERS HERE
*
*
*************************************************************************/
public class TestMTF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveToFront<String> m = new MoveToFront<String>();
		m.push("a");
		m.push("b");
		m.pop(); //Removes b
		m.push("c");
		m.push("d");
		m.push("a");//Puts a on top
		
		
		
		while (!m.isEmpty())
			System.out.println(m.pop());
		
		if(m.contains("h") == true){
			System.out.println("\n The character is present");
		}
		else{
			System.out.println("\n The character is not present");
		}
		//m.toString();
		
	}//end main

}//end class
