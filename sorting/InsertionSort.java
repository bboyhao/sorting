package sorting;

public class InsertionSort{
	public static void sort(int[] array){
		int tmp = 0;
		int length = array.length;
		for(int i = 1; i<length;i++){
			for(int j =i; j>0 && array[j]<array[j-1]; j--){
				tmp = array[j];
				array[j]=array[j-1];
				array[j-1]=tmp;
			}
		}
	}
}