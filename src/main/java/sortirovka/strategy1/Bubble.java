package sortirovka.strategy1;

public class Bubble implements SortBehavior{
	
	public int[] sortirovka(int[] arrayToSort){
		int temp;
		if (arrayToSort.length == 0) return arrayToSort;
		for (int i =0; i < arrayToSort.length;i++){
			for (int j =0; j < arrayToSort.length-1-i;j++){
				if (arrayToSort[j] > arrayToSort[j+1]){
					temp = arrayToSort[j+1];
					arrayToSort[j+1] = arrayToSort[j];
					arrayToSort[j]= temp;
				}
			}
		}
		return arrayToSort;
	}
	public String toString(){
		return "Bubble";
	}
}
