package sorting;
/*
    - 希尔排序的算法思想：将待排序数组按照步长gap进行分组，然后将每组的元素利用直接插入排序的方法进行排序；
    每次将gap折半减小，循环上述操作；当gap=1时，利用直接插入，完成排序。
    同样的：从上面的描述中我们可以发现：希尔排序的总体实现应该由三个循环完成：
    1. 第一层循环：将gap依次折半，对序列进行分组，直到gap=1
    2. 第二、三层循环：也即直接插入排序所需要的两次循环。具体描述见上。
 */
public class ShellSort {
    public static void sort(int[] array){
        int tmp = 0;
        int length = array.length;
        int d = length/2;
        while(d>=1){
            for(int i =0;i<d;i++){
                for(int j=i+d; j<length;j+=d){
                    for(int m=j;m>=d&&array[m]<array[m-d];m-=d){
                        tmp = array[m];
                        array[m] = array[m-d];
                        array[m-d]=tmp;
                    }
                }
            }
            d/=2;
        }

    }
}
