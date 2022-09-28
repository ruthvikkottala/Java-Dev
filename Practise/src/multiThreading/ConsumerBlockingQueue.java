package multiThreading;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable{
	BlockingQueue<String> blockingQueue = null;
	
	public ConsumerBlockingQueue(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String element = this.blockingQueue.take();
				System.out.println("Consumedd element -> "+element);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
