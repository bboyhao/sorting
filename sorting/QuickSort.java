package sorting;


import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array, int low, int high){
        if(array==null) return;
        if(low>=high) return;
        int pivot = partition(array, low, high);
        sort(array, low, pivot-1);
        sort(array, pivot+1, high);

    }

    public static int partition(int[] array, int low, int high){
        int lastsmall = low;
        int i = low+1;
        int pivot = (low+high)/2;
        swap(array, pivot, low);
        pivot = low;
        while(i<=high){
            if(array[i]<array[pivot]){
                swap(array, ++lastsmall, i);
            }
            i+=1;
        }
        swap(array, pivot, lastsmall);
        System.out.println(Arrays.toString(array));
        return lastsmall;
    }

    public static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
