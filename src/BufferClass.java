public class BufferClass {
	private int bufferCell = 0; // buffer for an integer
	private boolean writeable = true; // flag

	public synchronized void setBuffer(int val) {
		while (!writeable) {
			try {
				wait(); // voluntarily enter the wait state
			} catch (InterruptedException e) {
				System.err.println("Exception: " + e.toString());
			}
		}
		bufferCell = val;
		System.out.println("Producer sets bufferCell " + bufferCell);
		writeable = false;
		notifyAll();
	}

	public synchronized int getBuffer() {
		while (writeable) {
			try {
				wait(); // voluntarily enter the wait state
			} catch (InterruptedException e) {
				System.err.println("Exception: " + e.toString());
			}
		}
		writeable = true;
		notifyAll();
		return bufferCell;
	}
}
