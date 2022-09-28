package multiThreading;

public class CustomThread implements Runnable {

	private int threadNumber;

	public CustomThread(int i) {
		this.threadNumber = i;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "Thread Number -> " + threadNumber+"  Thread Name -> "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
