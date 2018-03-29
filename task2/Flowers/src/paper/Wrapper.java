package paper;

public abstract class Wrapper {
	protected double price;

	public Wrapper(double price) {
		this.price = price;
	}

	public double getPrice(int n) {
		if (n < 3) {
			return price;
		} else {
			return price * 2;
		}
	}

}
