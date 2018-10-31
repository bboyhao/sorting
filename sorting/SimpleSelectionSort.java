package sorting;

import java.util.Arrays;

public class SimpleSelectionSort {
    public static void sort(int[] array){
        int smallest_index;
        int temp;
        int length = array.length;

        if(array == null) return;
        for(int i = 0; i<length; i++) {
            smallest_index = findSmallestIndex(array, i, length);

            temp = array[i];
            array[i] = array[smallest_index];
            array[smallest_index] = temp;
        }
    }
    public static int findSmallestIndex(int[] array, int start, int end){
        int result = start;
        for(int i = start+1; i < end; i++){
            if(array[i]<array[result]){
                result=i;
            }
        }
        return result;
    }
}
