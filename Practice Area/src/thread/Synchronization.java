package thread;

public class Synchronization extends Thread{
	
	@Override
	public synchronized void run() {
		try {
			
			System.out.println("Start");
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(i);
			}
			System.out.println("End");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Synchronization s1 = new Synchronization();
		s1.start();
//		try {
//			s1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Synchronization s2 = new Synchronization();
		s2.start();
//		try {
//			s2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}