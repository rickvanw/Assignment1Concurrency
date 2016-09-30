import java.util.Random;

/**
 * Created by rickv on 8-9-2016.
 */
public class Opdracht1_1 {

    public static void main(String[] args) {

        // Het aantal te sorteren getallen
        int amount = 400000;

        int arr[];
        arr = new int[amount];

        // Maakt de random getallen aan
        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i]=getal;

        }

        // Plaatst de array in de bubblesort class
        BubbleSort bubbleSort = new BubbleSort(arr);

        // Uitvoer ter controle
        //System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(arr[i] + " ");
        }
        //System.out.println();

        // START TIMER
        long startTime = System.currentTimeMillis();

        // Voert sortering uit
        bubbleSort.run();

        // EIND TIMER
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" ms");

        // Uitvoer ter controle
        //System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(arr[i] + " ");
        }

    }
}
