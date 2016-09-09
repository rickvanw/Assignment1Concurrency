import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by rickv on 8-9-2016.
 */
public class Opdracht1_3 {

    public static void main(String[] args) {

        int amount = 800000;

        int arr[];
        arr = new int[amount];

        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i] = getal;

        }


        // START TIMER
        long startTime = System.currentTimeMillis();

        int[] sorted = ThreadTree.ThreadTree(arr);

        // EIND TIMER
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" ms");


        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(sorted[i] + " ");

        }

        System.out.println("first: " + sorted[0] + " ");
        System.out.println("mid: " + sorted[sorted.length/2] + " ");
        System.out.println("last: " + sorted[sorted.length-1] + " ");
    }
}
