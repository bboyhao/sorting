package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingApp{
	public static void main(String[] args){
		int[] array = {902,456,36,35,32,56,5478,654,3421,2341,345,1,6,547358};
		System.out.println("Choose one sorting method:");
		System.out.println("1. InsertionSort");
		System.out.println("2. ShellSort");
        System.out.println("3. SimpleSelectionSort");
        System.out.println("4. HeapSort");
        System.out.println("5. BubbleSort");
        System.out.println("6. QuickSort");
        System.out.println("7. MergeSort");
        System.out.println("8. RadixSort");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("before sorting, array is "+ Arrays.toString(array));
		switch(choice){
			case 1:
				InsertionSort.sort(array);
				break;
            case 2:
                ShellSort.sort(array);
                break;
            case 3:
                SimpleSelectionSort.sort(array);
                break;
            case 4:
                HeapSort.sort(array);
                break;
            case 5:
                System.out.println("Which bubblesort would you like?\n1.bubblesort\n2.bubblesort2\n3.bubblesort3");
                int which = sc.nextInt();
                if(which == 1) BubbleSort.sort(array);
                else if(which == 2) BubbleSort.sort2(array);
                else BubbleSort.sort3(array);
                break;
            case 6:
                QuickSort.sort(array, 0, array.length-1);
                break;
            case 7:
                if(array == null || array.length <= 1) break;
                int[] tmp = new int[array.length];
                MergeSort.sort(array, 0, array.length - 1, tmp);
                break;
            case 8:
                RadixSort.sort(array);
                break;
			default:
				System.exit(0);
		}
		System.out.println("after sorting, array is "+ Arrays.toString(array));
	}
}