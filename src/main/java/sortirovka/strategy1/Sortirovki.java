package sortirovka.strategy1;

import java.util.Random;

public class Sortirovki {

	public static void main(String[] args){
		final Random random = new Random();
		int razmer = random.nextInt(1000);//izmenyaem razmer massiva

		int [] array1 = new int[razmer];
		Sortirovka sortirovka = new Sortirovka();

		SortBehavior [] sortiki = {new Bubble(),
				new Brush(),
				new Shaker(),
				new EvenOdd(),
//				new Brush(),
//				new EvenOdd(),
//				new Shaker(),
//				new Bubble()
		};

		for (int i = 0; i < sortiki.length; i++){
			sortirovka.setSortBehavior(sortiki[i]);
			sortirovka.randomFill(array1, 1234567890);
			System.out.println("Исходный массив:");
			sortirovka.arrayShow(array1);
			System.out.println(sortiki[i].toString());
			sortirovka.performSort(array1);
			sortirovka.arrayShow(array1);
			System.out.println();			
		}
	}
}
