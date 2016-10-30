package sortirovka.strategy1;

public class Shaker  implements SortBehavior{
	
	public int[] sortirovka(int[] arrayToSort){
		int temp;
		int counter1=0;
		int counter2=0;
		int reverseFlag=0;
		int fullArrayCounter=0;
		if (arrayToSort.length == 0) return arrayToSort;
		while(true){
			if (fullArrayCounter % 2 == 1) reverseFlag = 1;
			else reverseFlag = 0;

			if (reverseFlag == 0){ 
				for(int i = counter1; i < arrayToSort.length-counter1-1;i++){
					if (arrayToSort[i] > arrayToSort[i+1]){
						temp = arrayToSort[i+1];
						arrayToSort[i+1] = arrayToSort[i];
						arrayToSort[i]= temp;						
					}
				}
				counter1++;
			}
			else{
				for(int i = arrayToSort.length-counter2-2; i > counter2; i--){
					if (arrayToSort[i] < arrayToSort[i-1]){
						temp = arrayToSort[i-1];
						arrayToSort[i-1] = arrayToSort[i];
						arrayToSort[i]= temp;

					}
				}
				counter2++;
			}
			if (fullArrayCounter == arrayToSort.length-1) {
				break;
			}
			fullArrayCounter++;
		}
		return arrayToSort;
	}
	public String toString(){
		return "Shaker";
	}
}
