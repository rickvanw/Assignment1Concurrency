import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by rickv on 1-9-2016.
 */
public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}


