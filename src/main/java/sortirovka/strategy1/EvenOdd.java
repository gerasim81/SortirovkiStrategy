package sortirovka.strategy1;

public class EvenOdd implements SortBehavior{
	
	public int[] sortirovka(int[] arrayToSort){
		int temp;
		int evenOddTemp=0;
		boolean changeFlg = false;
		if (arrayToSort.length == 0) return arrayToSort;
		while(true){
			for (int i = 0; i < arrayToSort.length-1;i+=2){
				if (arrayToSort[i] > arrayToSort[i+1]){
					temp = arrayToSort[i+1];
					arrayToSort[i+1] = arrayToSort[i];
					arrayToSort[i]= temp;
					changeFlg = true;
				}
			}
			if (arrayToSort.length%2 == 0){evenOddTemp = arrayToSort.length - 2;}
			else{evenOddTemp = arrayToSort.length -1;}


			for (int i = 1; i < evenOddTemp;i+=2){
				if (arrayToSort[i] > arrayToSort[i+1]){
					temp = arrayToSort[i+1];
					arrayToSort[i+1] = arrayToSort[i];
					arrayToSort[i]= temp;
					changeFlg = true;
				}
			}
			if (!changeFlg){
				break;
			}
			else {
				changeFlg = false;
			}
		}
		return arrayToSort;
	}
	public String toString(){
		return "EvenOdd";
	}
}
