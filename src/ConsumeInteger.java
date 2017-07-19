public class ConsumeInteger extends Thread {
	private BufferClass cBuffer;

	public ConsumeInteger(BufferClass h) {
		cBuffer = h;
	}

	public void run() {
		int val;
		val = cBuffer.getBuffer();
		System.out.println("\tConsumer retrieved " + val);

	}
}
