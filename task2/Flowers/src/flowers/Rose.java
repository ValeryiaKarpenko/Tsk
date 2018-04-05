package flowers;

public class Rose extends Flower {
	public static String name = "Rose";
	private double lenght;

	public Rose(String color, double lenght, double price) {
		super(name, color, price);
		this.lenght = lenght;
		this.price = generatePrice(price);
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	private double generatePrice(double price) {
		if (lenght < 30) {
			return price * 2;
		} else {
			return price;
		}
	}
}
