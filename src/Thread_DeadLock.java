
public class Thread_DeadLock {

	public static void main(String[] args) {
		
		final String resource1="rhutu";
		final String resource2="anki";
		
		Thread t1=new Thread() {
		
		public void run() {
			synchronized(resource1) {
				System.out.println("Thread 1:locked resource 1");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			
			synchronized(resource2) {
				System.out.println("Thread 1:locked resource 2");
				try {Thread.sleep(1000);} catch (Exception e) {
				}
			}
		}

	};
	
	
	
Thread t2=new Thread() {
		
		public void run() {
			synchronized(resource2) {
				System.out.println("Thread 2:locked resource 1");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			
			synchronized(resource1) {
				System.out.println("Thread 2:locked resource 2");
				try {Thread.sleep(1000);} catch (Exception e) {
				}
			}
		}

	};
	
	t1.start();
	t2.start();	
	
}

}
