package CTCI_16;

/** Threads and Locks
 * Threads can be implemented in two ways:
 * 	1. Implementing the java.lang.Runnable interface
 * 	2. Extending the java.lang.Thread class
 * 
 * Runnable may be preferred because:
 * 	- No multiple inheritance in Java so using Runnable allows you to extend from another class
 * 	- A class might only be interested in being runnable, and therefore, inheriting the full 
 * 	overhead of the Thread class would be excessive
 */
public class CTCI_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRunnable instance = new SimpleRunnable();
		Thread thread = new Thread(instance);
		thread.start();
		
		/* waits until above thread counts to 5 (slowly) */
		while (instance.count != 5) {
			try {
				Thread.sleep(250);;
				System.out.println("hi");
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
	}

}
