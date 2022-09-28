package multiThreading;

public class QAThread extends Thread {
	
	public QAThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Task assigned to "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Task finished by "+Thread.currentThread().getName());
	}
}