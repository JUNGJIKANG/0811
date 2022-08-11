
public class GenericDemo {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5);
		int result = car.getValue();
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue();
		Car<String> car2 = new Car<String>("HI");
		String result2 = car2.getValue();
		System.out.println(result+result1+result2);
	}
}

class Car<A> {
	private A value;

	public Car(A value) {
		this.value = value;
	}

	public A getValue() {
		return value;
	}

	public void setValue(A value) {
		this.value = value;
	}

}