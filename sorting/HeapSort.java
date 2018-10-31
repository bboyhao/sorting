package sorting;

public class HeapSort {
    public static void sort(int[] array){
        if(array == null) return;
        int length = array.length;
        for(int i = length/2; i>=0; i--){
            heapify(array, i, length-1);
        }
        for(int i = length-1;i>0;--i){
            int tmp = array[i];
            array[i] = array[0];
            array[0]=tmp;
            heapify(array, 0, i-1);
        }
    }

    public static void heapify(int[] array, int start, int end){
        int tmp = array[start];
        for(int i = 2*start+1; i<=end; i*=2){
            if(i<end && array[i]<array[i+1]){
                ++i;
            }
            if(tmp > array[i]) break;
            array[start]=array[i];
            start=i;
        }
        array[start] = tmp;

    }

    public static void swap(int a, int b){
        int tmp =a;
        a=b;
        b=tmp;
    }
}
