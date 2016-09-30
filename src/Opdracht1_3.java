import java.util.Random;

/**
 * Created by rickv on 8-9-2016.
 */
public class Opdracht1_3 {

    public static void main(String[] args) {

        // Het aantal te sorteren getallen
        int amount = 800000;

        int arr[];
        arr = new int[amount];

        // Maakt de random getallen aan
        for (int i = 0; i < amount; i++) {

            Random random = new Random();

            int getal = random.nextInt(amount);

            arr[i] = getal;

        }


        // START TIMER
        long startTime = System.currentTimeMillis();

        // Plaatst de complete array in de ThreadTree en voert deze uit
        int[] sorted = ThreadTree.ThreadTree(arr);

        // EIND TIMER
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" ms");

        // Uitvoer ter controle
        //System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            //System.out.print(sorted[i] + " ");

        }

        // Uitvoer ter controle
        //System.out.println("first: " + sorted[0] + " ");
        //System.out.println("mid: " + sorted[sorted.length/2] + " ");
        //System.out.println("last: " + sorted[sorted.length-1] + " ");
    }
}
