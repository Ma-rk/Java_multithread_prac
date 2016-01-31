package synchroProblemPrac;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
	public static void main(String args[]) {
		System.out.println("Begin of main...");
		
		List<Thread> threadList = new ArrayList<Thread>();

		SynchTester st = new SynchTester();

		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));
		threadList.add(new Thread(new MultiCaller(st)));

		for (Thread t : threadList)
			t.start();

		try {
			for (Thread t : threadList)
				t.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted!!!");
			e.printStackTrace();
		}
		System.out.println("end of main...");
	}
}
