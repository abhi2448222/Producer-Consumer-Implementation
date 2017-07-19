import java.util.*;

public class ProducerConsumer {
	public static void main(String args[]) {
		BufferClass h = new BufferClass();
		ArrayList<ProduceInteger> pList = new ArrayList<ProduceInteger>();
		for (int i = 0; i < 10; i++) {
			ProduceInteger p = new ProduceInteger(h);
			pList.add(p);
		}

		ArrayList<ConsumeInteger> cList = new ArrayList<ConsumeInteger>();
		for (int i = 0; i < 10; i++) {
			ConsumeInteger c1 = new ConsumeInteger(h);
			cList.add(c1);
		}

		for (int i = 0; i < 10; i++) {
			pList.get(i).start();
		}

		for (int i = 0; i < 10; i++) {
			cList.get(i).start();
		}

	}
}
