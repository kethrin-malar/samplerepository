package saravan;

import java.util.concurrent.ConcurrentHashMap;

public class SampleConcurrentHashMap {

	
	    public static void main(String[] args) {

	        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        Thread thread1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	               // for (;;) {
	                    System.out.println("Value of A: " + map.remove("A"));
	                    try {
	                        Thread.sleep(1000); // 1 second delay
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                //}
	            }
	        });

	        Thread thread2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                //for (;;) {
	                    System.out.println("Value of B: " + map.get("B"));
	                    try {
	                        Thread.sleep(1000); // 1 second delay
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                //}
	            }
	        });

	        Thread thread3 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                //for (;;) {
	                    map.put("D", 4);
	                    System.out.println("Added key D with value 4");
	                    try {
	                        Thread.sleep(1000); // 1 second delay
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                //}
	            }
	        });

	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
	}
