import java.util.Random;

/**
 * Created by rickv on 8-9-2016.
 */
public class Opdracht1_2 {

    public static void main(String[] args) {

        // Het aantal te sorteren getallen
        int amount = 800000;

        int arr[];
        arr = new int[amount];

        // Maakt de random getallen aan
        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i]=getal;

        }

        int[] part1 = new int[amount/2];
        int[] part2 = new int[amount/2];

        // Splitst de arrays in twee delen
        System.arraycopy(arr, 0, part1, 0, part1.length);
        System.arraycopy(arr, part1.length, part2, 0, part2.length);

        // Uitvoer ter controle
        //System.out.println("Array vóór sortering");
        for(int i=0; i < arr.length; i++){
            //System.out.print(arr[i] + " ");
        }
        //System.out.println();

        // Plaatst de twee delen van de array in een eigen bubblesort
        BubbleSort bubbleSort = new BubbleSort(part1);
        BubbleSort bubbleSort2 = new BubbleSort(part2);

        // Maakt een thread aan voor beide bubbesort
        Thread t1 = new Thread(bubbleSort);
        Thread t2 = new Thread(bubbleSort2);

        // START TIMER
        long startTime = System.currentTimeMillis();

        // Voer beide threads uit
        t1.start();
        t2.start();

        try	{
            t1.join();
            t2.join();
        }	catch	(InterruptedException	IE)	{}

        // Voegt gesorteerde arrays samen tot één gesorteerde array
        int[] mergedArray = Merge.Merge(bubbleSort.getArr(), bubbleSort2.getArr());

        // EIND TIMER
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " ms");

        // Uitvoer ter controle
        //System.out.println("Array na sortering");
        for(int i=0; i < arr.length; i++){
            //System.out.print(mergedArray[i] + " ");
        }

    }

}
