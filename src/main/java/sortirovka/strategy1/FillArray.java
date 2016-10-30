package sortirovka.strategy1;

import java.util.Random;

public class FillArray {
	SortBehavior sortBehavior;

	public void performSort(int[] arrayToSort){
		sortBehavior.sortirovka(arrayToSort);
	}

	public void setSortBehavior(SortBehavior sb){
		sortBehavior = sb;
	}

	public int[] randomFill(int[] arrayToFill, long digit) {
		final Random random = new Random();
		if (digit == 0) return arrayToFill;
		for (int i =0; i < arrayToFill.length;i++){
			arrayToFill[i]= random.nextInt(999);
		}
		return arrayToFill;
	}

	public void arrayShow(int[] arrayToShow){
		for (int i = 0; i < arrayToShow.length;i++){
			System.out.print(arrayToShow[i] + " ");
		}
		System.out.println();
	}
}
