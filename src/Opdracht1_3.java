import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by rickv on 8-9-2016.
 */
public class Opdracht1_3 {

    public static void main(String[] args) {

        int amount = 400000;

        int arr[];
        arr = new int[amount];

        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i] = getal;

        }


        long startTime = System.nanoTime();

        int[] sorted = ThreadTree.ThreadTree(arr);

        long difference = System.nanoTime() - startTime;
        System.out.println("Total execution time: " +
                String.format("%d min, %d sec, %d mil",
                        TimeUnit.NANOSECONDS.toMinutes(difference),
                        TimeUnit.NANOSECONDS.toSeconds(difference) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(difference)),
                        TimeUnit.NANOSECONDS.toMillis(difference) -
                                TimeUnit.MINUTES.toMillis(TimeUnit.NANOSECONDS.toMinutes(difference)) -
                                TimeUnit.SECONDS.toMillis(TimeUnit.NANOSECONDS.toSeconds(difference)))

        );
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(sorted[i] + " ");
        }

    }
}
