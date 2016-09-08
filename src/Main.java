import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    /*public static void main(String[] args) {

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
        BubbleSort.bubbleSort(arr);//sorting array elements using bubble sort
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

    }*/

    public static void main(String[] args) {

        int amount = 100000;

        int arr[];
        arr = new int[amount];

        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i]=getal;

        }

        int[] part1 = new int[amount/2];
        int[] part2 = new int[amount/2];

        System.arraycopy(arr, 0, part1, 0, part1.length);
        System.arraycopy(arr, part1.length, part2, 0, part2.length);

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long startTime = System.nanoTime();

        BubbleSort bubbleSort = new BubbleSort(part1);
        BubbleSort bubbleSort2 = new BubbleSort(part2);

        Thread t1 = new Thread(bubbleSort);
        Thread t2 = new Thread(bubbleSort2);

        t1.start();
        t2.start();

        try	{
            t1.join();
            t2.join();
        }	catch	(InterruptedException	IE)	{}

        int[] mergedArray = Merge.Merge(bubbleSort.getArr(), bubbleSort2.getArr());

        long difference = System.nanoTime() - startTime;
        System.out.println("Total execution time: " +
                String.format("%d min, %d sec",
                        TimeUnit.NANOSECONDS.toHours(difference),
                        TimeUnit.NANOSECONDS.toSeconds(difference) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(difference))));
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(mergedArray[i] + " ");
        }

    }

}
