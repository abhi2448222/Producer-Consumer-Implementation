public class ProduceInteger extends Thread {
	private BufferClass pBuffer;

	public ProduceInteger(BufferClass h) {
		pBuffer = h;
	}

	public void run() {
		int x = (int) (Math.random() * 5000);
		pBuffer.setBuffer(x);
	}
}
