package bouquet;

import flowers.Flower;

public class BouquetManager {
	Bouquet bouquet = new Bouquet();

	public void addFlower(Flower flower) {
		Flower[] flowers = bouquet.getFlowers();
		if (!checkArray(flowers)) {
			resizeArr(flowers);
		} else {
			Integer index = getNullIndex(flowers);
			for (int i = 0; i < flowers.length; i++) {
				flowers[index] = flower;
			}
		}
		System.out.println(flower);
	}

	public Integer getNullIndex(Flower[] flowers) {
		Integer index = null;
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i] == null) {
				index = i;
				return index;
			}
		}
		return null;
	}

	public boolean checkArray(Flower[] flowers) {
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i] == null) {
				return true;
			}
		}
		return false;
	}

	public Flower[] resizeArr(Flower[] flowers) {
		int size = flowers.length;
		int newSize = size * 2;
		Flower[] newFlowers = new Flower[newSize];
		System.arraycopy(flowers, 0, newFlowers, 0, size);
		return newFlowers;
	}

	public double getPriceFlower(Flower flower) {
		double price = flower.getPrice();
		return price;
	}

	public double getPriceBouquet() {
		Flower[] flowers = bouquet.getFlowers();
		int price = 0;
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i] != null) {
				price += getPriceFlower(flowers[i]);
			}
		}
		System.out.println(price);
		return price;
	}

}
