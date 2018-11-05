package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array, int start, int end, int[] tmp){
        if(end <= start) return;
        sort(array, start, (start + end)/2, tmp);
        sort(array, (start+end)/2 +1, end, tmp);
        merge(array, start, end, tmp);
    }

    public static void merge(int[] array, int start, int end, int[] tmp) {
        int mid = (start + end) / 2;
        int first = start;
        int second = mid + 1;
        int i = start;
        while (first <= mid && second <= end) {
            if (array[first] < array[second]) {
                tmp[start] = array[first];
                ++first;
            } else {
                tmp[start] = array[second];
                ++second;
            }
            ++start;
        }
        while (start <= end) {
            if (first > mid) tmp[start++] = array[second++];
            else tmp[start++] = array[first++];
        }
        for(;i <= end; i++){
            array[i] = tmp[i];
        }
    }
}
