package bouquet;

import java.util.ArrayList;

import flowers.Flower;
import paper.Wrapper;

public class Bouquet {
	private double priceFlower;
	private double priceWrapper;
	private double price;
	public int count = 0;
	private ArrayList<Flower> flowers = new ArrayList<Flower>();
	private ArrayList<Wrapper> wrappers = new ArrayList<Wrapper>();

	public double getPrice() {
		price = priceWrapper + priceFlower;
		System.out.println(price);
		return price;
	}

	public Bouquet addWrapper(Wrapper wrapper) {
		wrappers.add(wrapper);
		priceWrapper += wrapper.getPrice(count);
		return this;
	}

	public Bouquet addFlower(Flower flower) {
		flowers.add(flower);
		++count;
		priceFlower += flower.getPrice();
		return this;
	}
}
