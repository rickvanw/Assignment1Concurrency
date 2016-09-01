import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int amount = 100000;

        int arr[];
        arr = new int[amount];

        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i]=getal;

        }

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(arr[i] + " ");
        }
        System.out.println();
        long startTime = System.nanoTime();
        BubbleSortExample.bubbleSort(arr);//sorting array elements using bubble sort
        long difference = System.nanoTime() - startTime;
        System.out.println("Total execution time: " +
                String.format("%d min, %d sec",
                        TimeUnit.NANOSECONDS.toHours(difference),
                        TimeUnit.NANOSECONDS.toSeconds(difference) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(difference))));
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(arr[i] + " ");
        }

    }


}
