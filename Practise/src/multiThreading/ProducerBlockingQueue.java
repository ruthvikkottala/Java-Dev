package multiThreading;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {
	BlockingQueue<String> blockingQueue = null;

	public ProducerBlockingQueue(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			long timeMillis = System.currentTimeMillis();

			try {
				this.blockingQueue.put("" + timeMillis);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
