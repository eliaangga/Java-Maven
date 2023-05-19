
public class Driver {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Count:" + counter.getCount());

		counter.increment(5);

		System.out.println("Count:" + counter.getCount());

		counter.decrement(2);

		System.out.println("Count:" + counter.getCount());

		counter.multiplyBy(6);

		System.out.println("Count:" + counter.getCount());

	}

}
