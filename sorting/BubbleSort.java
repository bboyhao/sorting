package sorting;


public class BubbleSort {
/*
    If no swap happened in a loop, breakout from sorting
 */
    public static void sort(int[] array){
        if(array==null || array.length == 1 || array.length==2) return;
        for(int i = array.length-1;i>0;--i){
            boolean ordered = true;
            for(int j =0;j<i;j++){
                if (array[j] > array[j+1]) {
                    if(ordered)
                        ordered=false;
                    swap(array, j, j+1);
                }
            }
            if(ordered)
                break;
        }
    }

    public static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    /**
     * 每次loop确定最大与最小的两个数
     */

    public static void sort3(int[] array) {
        if(array==null || array.length == 1 || array.length==2) return;
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            for(int i = low; i<high; ++i){
                if(array[i]>array[i+1]){
                    swap(array, i, i+1);
                }
            }
            high--;
            for(int i = high; i>low; --i){
                if(array[i]<array[i-1]){
                    swap(array, i, i-1);
                }
            }
            low++;
        }
    }

    /**
     * 每次交换会记录位置，下次loop会停止在最后一次swap的地方
     */
    public static void sort2(int[] array) {
        if(array==null || array.length == 1 || array.length==2) return;
        int i = array.length-1;
        while(i>0){
            int pos = 0;
            for(int j =0;j<i;j++){
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    pos = j;
                }
            }
            i = pos;
        }
    }
}
