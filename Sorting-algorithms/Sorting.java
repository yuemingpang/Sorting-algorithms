import java.util.Comparator;

/**
 * Implementation of various iterative sorting algorithms.
 */
public class Sorting {


    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        int stopIndex = arr.length - 1;
        while (stopIndex != 0) {
            int i = 0;
            int lastSwap = 0;
            while (i < stopIndex) {
                if (comparator.compare(arr[i], arr[i+1])>0) {
                    T temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    lastSwap = i;
                }
                i++;
            }
            stopIndex = lastSwap;
        }
    }

 
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        for (int i = arr.length-1; i>0; i--) {
            int max = i;
            for (int j = 0; j<i; j++) {
                if (comparator.compare(arr[j], arr[max])>0) {
                    max = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }              
    }


    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        for (int n = 1; n<arr.length; n++) {
            int i = n;
            while (i>0 && comparator.compare(arr[i], arr[i-1])<0) {
                T temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }
    }
}