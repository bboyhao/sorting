package sorting;

import java.util.Arrays;

public class RadixSort {
    public static void sort(int[] array){
        if(array == null || array.length <=1) return;
        int max = findMax(array);
        int digit = getDigit(max);
        for(int i = 0; i<digit; ++i){
            countSort(array, (int) Math.pow(10, i));
        }
    }

    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getDigit(int n){
        int result = 1;
        while(n/10!=0){
            n/=10;
            result+=1;
        }
        return result;
    }

    public static void countSort(int[] array, int place){
        int[] buckets = new int[10];
        int[] output = new int[array.length];

        for(int i = 0; i < array.length; i++){
            buckets[array[i]/place%10]+=1;
        }
        for(int i = 1; i <10; ++i){
            buckets[i] += buckets[i-1];
        }
        for(int i = array.length - 1; i>=0;--i){
            output[buckets[array[i]/place%10]-1] = array[i];
            buckets[array[i]/place%10] -= 1;
        }
        for(int i = 0; i<array.length;++i){
            array[i] = output[i];
        }


    }
}
