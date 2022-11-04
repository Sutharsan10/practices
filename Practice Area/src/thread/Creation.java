package thread;

public class Creation implements Runnable{
	private int count;
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(count ++);
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Creation c1 = new Creation();
		Thread t1 = new Thread(c1);
		t1.start();
		Creation c2 = new Creation();
		Thread t2 = new Thread(c2);
		t2.start();
		
		
	}

}
