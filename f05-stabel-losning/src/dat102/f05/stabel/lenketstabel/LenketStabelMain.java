package dat102.f05.stabel.lenketstabel;

import dat102.f05.stabel.StabelADT;

/**
 * A driver that demonstrates the class LinkedStack.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public class LenketStabelMain {
	
	public static void main(String[] args) {
		testStackOperations();//tester metoden StackOperations
		System.out.println("\n\nDone.");
	} // end main

	public static void testStackOperations() {
		System.out.println("Create a stack: ");//spørr etter å lage en bunke?
		StabelADT<String> myStack = new LenketStabel<>();//kaller den nye bunken for mystack og bruker interfacet til StabeADT
		System.out.println("isEmpty() returns " + myStack.isEmpty());//bruker metoden isEmty

		System.out.println("\nAdd to stack to get\n" + "Joe Jane Jill Jess Jim");
		myStack.push("Jim");
		myStack.push("Jess");
		myStack.push("Jill");
		myStack.push("Jane");
		myStack.push("Joe");

		System.out.println("\nisEmpty() returns " + myStack.isEmpty());

		System.out.println("\nTesting peek and pop:");
		while (!myStack.isEmpty()) {
			String top = myStack.peek();
			System.out.println("\n" + top + " is at the top of the stack.");

			top = myStack.pop();
			System.out.println(top + " is removed from the stack.");
		} // end while

		System.out.print("\nThe stack should be empty: ");
		System.out.println("isEmpty() returns " + myStack.isEmpty());

		System.out.println("\nAdd to stack to get\n" + "Jim Jess Joe\n");
		myStack.push("Joe");
		myStack.push("Jess");
		myStack.push("Jim");

		System.out.println("\nTesting clear:");
		myStack.clear();

		System.out.println("The stack should be empty: ");
		System.out.println("\nisEmpty() returns " + myStack.isEmpty());

//		System.out.println("\n myStack.peek() returns ");
//		System.out.println(myStack.peek());
//		System.out.println("\n myStack.pop()  returns ");
//		System.out.println(myStack.pop());
	} // end testStackOperations
} // end Driver

/*
 * Create a stack: isEmpty() returns true
 * 
 * Add to stack to get Joe Jane Jill Jess Jim
 * 
 * isEmpty() returns false
 * 
 * Testing peek and pop:
 * 
 * Joe is at the top of the stack. Joe is removed from the stack.
 * 
 * Jane is at the top of the stack. Jane is removed from the stack.
 * 
 * Jill is at the top of the stack. Jill is removed from the stack.
 * 
 * Jess is at the top of the stack. Jess is removed from the stack.
 * 
 * Jim is at the top of the stack. Jim is removed from the stack.
 * 
 * The stack should be empty: isEmpty() returns true
 * 
 * Add to stack to get Jim Jess Joe
 * 
 * 
 * Testing clear: The stack should be empty:
 * 
 * isEmpty() returns true
 * 
 * myStack.peek() returns Exception in thread "main"
 * java.util.EmptyStackException at LinkedStack.peek(LinkedStack.java:28) at
 * Driver.testStackOperations(Driver.java:58) at Driver.main(Driver.java:12)
 * 
 */
