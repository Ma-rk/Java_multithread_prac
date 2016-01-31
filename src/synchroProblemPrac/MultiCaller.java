package synchroProblemPrac;

public class MultiCaller implements Runnable {
	SynchTester st;

	public MultiCaller(SynchTester st) {
		this.st = st;
	}

	@Override
	public void run() {
		System.out.println("Begin of " + Thread.currentThread().getName());
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int idxPointer = st.getPointer();
			if (idxPointer >= 20)
				System.out.println(Thread.currentThread().getName() + " problem!!! [" + idxPointer + "]" + i);
		}
		System.out.println("end of " + Thread.currentThread().getName());
	}
}
