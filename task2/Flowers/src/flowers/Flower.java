package flowers;

public abstract class Flower {
	protected String name;
	protected double price;
	protected String color;

	public Flower(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
}
