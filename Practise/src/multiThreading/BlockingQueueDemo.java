package multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);

		ProducerBlockingQueue producer = new ProducerBlockingQueue(blockingQueue);
		ConsumerBlockingQueue consumer = new ConsumerBlockingQueue(blockingQueue);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();

	}
}
