package multiThreading;

import java.util.concurrent.CountDownLatch;

public class Dev extends Thread {
	private CountDownLatch countDownLatch;

	public Dev(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		System.out.println("Task assigned to dev team " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Task finished by dev team " + Thread.currentThread().getName());
		countDownLatch.countDown();
	}
}