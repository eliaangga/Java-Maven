
public class Driver {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Count:" + counter.getCount());

		counter.incrementBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.decrementBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.multiplyBy(2);

		System.out.println("Count:" + counter.getCount());

	}

}
