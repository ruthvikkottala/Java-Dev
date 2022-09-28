package multiThreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
System.out.println(Thread.currentThread().getName() + " has started");
		
		CyclicBarrier barrier = new CyclicBarrier(4);
		
		PasserngerCyclicBarrier p1 = new PasserngerCyclicBarrier(1000, barrier, "John");
		PasserngerCyclicBarrier p2 = new PasserngerCyclicBarrier(2000, barrier, "Martin");
		PasserngerCyclicBarrier p3 = new PasserngerCyclicBarrier(3000, barrier, "Joya");
		PasserngerCyclicBarrier p4 = new PasserngerCyclicBarrier(4000, barrier, "Sam");
		
		PasserngerCyclicBarrier p5 = new PasserngerCyclicBarrier(1000, barrier, "Pipa");
		PasserngerCyclicBarrier p6 = new PasserngerCyclicBarrier(2000, barrier, "Dolly");
		PasserngerCyclicBarrier p7 = new PasserngerCyclicBarrier(3000, barrier, "Harman");
		PasserngerCyclicBarrier p8 = new PasserngerCyclicBarrier(4000, barrier, "Brad");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}
