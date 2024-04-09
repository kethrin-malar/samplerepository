package saravan;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SampleConHashMap {

	public static void main(String[] args) {

		//ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Value of A: " + map.remove("A"));
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(;;) {
					Set<String> keySet = map.keySet();
					 for(String key : keySet){
						 System.out.println(map.get(key));
					 }

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Value of B: " + map.put("D",1));
				}
				
			}
		});

		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(;;) {
					Set<String> keySet = map.keySet();
					 for(String key : keySet){
						 System.out.println(map.get(key));
					 }
					map.remove("D");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//System.out.println("Added key D with value 4");
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();

		

		System.out.println("Final contents of the map: " + map);
	}
}

