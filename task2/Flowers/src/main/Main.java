package main;

import bouquet.Bouquet;
import flowers.Lilies;
import flowers.Peony;
import flowers.Rose;
import flowers.Ñhrysanthemum;
import paper.Paper;
import paper.Ribbon;

public class Main {
	public static void main(String[] args) {
		Rose roseRedShort = new Rose("red", 10, 15);
		Rose roseRedLong = new Rose("red", 40, 15);
		Ñhrysanthemum chBlue = new Ñhrysanthemum("Blue", 10);
		Peony peony = new Peony("Pink", 20);
		Lilies lili = new Lilies("White", 30);

		Paper paper = new Paper(10);
		Ribbon ribbon = new Ribbon(2);

		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(roseRedShort).addFlower(roseRedLong).addFlower(lili).addFlower(chBlue).addFlower(peony);
		bouquet.addWrapper(paper).addWrapper(ribbon);
		bouquet.getPrice();

	}

}
