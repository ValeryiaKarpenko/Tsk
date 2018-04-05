package main;

import bouquet.Bouquet;
import bouquet.BouquetManager;
import flowers.Lilies;
import flowers.Peony;
import flowers.Rose;
import flowers.Ñhrysanthemum;

public class Main {
	public static void main(String[] args) {
		Rose roseRedShort = new Rose("red", 10, 15);
		Rose roseRedLong = new Rose("red", 40, 15);
		Ñhrysanthemum chBlue = new Ñhrysanthemum("Blue", 10);
		Peony peony = new Peony("Pink", 20);
		Lilies lili = new Lilies("White", 30);

		BouquetManager bm = new BouquetManager();

		bm.addFlower(roseRedShort);
		bm.addFlower(roseRedLong);
		bm.addFlower(lili);
		bm.addFlower(chBlue);
		bm.addFlower(peony);
		bm.getPriceBouquet();

	}

}
