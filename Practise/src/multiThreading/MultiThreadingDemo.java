package multiThreading;

import java.util.concurrent.CountDownLatch;

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch countDownLatch = new CountDownLatch(2);
		
//		for(int i=1;i<=5;i++) {
//			CustomThread custom = new CustomThread(i);
//			Thread thread = new Thread(custom);
//			thread.start();
//			if(i==2)
//				try {
//					thread.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			
//		}
		
		Dev teamDevA = new Dev(countDownLatch, "dev-A");
		Dev teamDevB = new Dev(countDownLatch, "dev-B");
		
		teamDevA.start();
		teamDevB.start();
		
		//When two threads(dev-A and dev-B)completed tasks are returned
		countDownLatch.await();
		
		//Now execution of thread(QA team) started..
		QAThread qaTeam = new QAThread("QA team");
		qaTeam.start(); 

	}

}
