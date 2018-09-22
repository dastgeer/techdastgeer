package com.dastgeer;

import com.dastgeer.ThreadLocalCheck;

public class ThreadLocalTest {

	public static void main(String[] args) {
		ThreadLocalCheck commonObject = new ThreadLocalCheck();

	      Thread t1 = new Thread(commonObject);
	      Thread t2 = new Thread(commonObject);
	      Thread t3 = new Thread(commonObject);
	      Thread t4 = new Thread(commonObject);

	      t1.start();
	      t2.start();
	      t3.start();
	      t4.start();
	    //  t1.run();
	      // wait for threads to end
	      try {
	         t1.join();
	         t2.join();
	         t3.join();
	         t4.join();
	      } catch (Exception e) {
	         System.out.println("Interrupted");
	      }
	}

}
