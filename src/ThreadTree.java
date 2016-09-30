/**
 * Created by rickv on 9-9-2016.
 */
public class ThreadTree {


    // Class geeft samengevoegde array terug gesorteerd met bubblesort
    public static int[] ThreadTree(int[] arr) {

        int[] doneArray;

        // In te stellen drempelwaarde om te bepalen of splitsing voor moet komen
        if(arr.length>100){
            //System.out.println("Split");

            int[] part1 = new int[arr.length/2];
            int[] part2 = new int[arr.length/2];

            // Splitst de arrays in twee delen
            System.arraycopy(arr, 0, part1, 0, part1.length);
            System.arraycopy(arr, part1.length, part2, 0, part2.length);

            // Maakt twee nieuwe instanties van deze class welke dezelfde checks nogmaals doen
            int[] part1Sorted = ThreadTree(part1);
            int[] part2Sorted = ThreadTree(part2);

            // Resultaat arrays worden gemerged
            doneArray = Merge.Merge(part1Sorted, part2Sorted);

        }else{

            // Drempelwaarde wordt niet overschreden dus wordt er een nieuwe thread aangemaakt
            //System.out.println("New Thread");

            // Uitvoer ter controle
            for(int i=0; i < arr.length; i++){
                //System.out.print(arr[i] + " ");
            }

            // Plaatst de array in een instantie van bubblesort
            BubbleSort bubbleSort = new BubbleSort(arr);

            // Plaats de runnable bubblesort in een nieuwe thread
            Thread t1 = new Thread(bubbleSort);

            // Voert de thread uit
            t1.start();

            try	{
                t1.join();
            }	catch	(InterruptedException	IE)	{}

            doneArray = bubbleSort.getArr();
        }

        return doneArray;

    }
}
