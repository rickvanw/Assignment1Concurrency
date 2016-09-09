/**
 * Created by rickv on 9-9-2016.
 */
public class ThreadTree {



    public static int[] ThreadTree(int[] arr) {

        int[] doneArray;

        if(arr.length>500){
            System.out.println("Split");

            int[] part1 = new int[arr.length/2];
            int[] part2 = new int[arr.length/2];

            System.arraycopy(arr, 0, part1, 0, part1.length);
            System.arraycopy(arr, part1.length, part2, 0, part2.length);

            int[] part1Sorted = ThreadTree(part1);
            int[] part2Sorted = ThreadTree(part2);

            doneArray = Merge.Merge(part1Sorted, part2Sorted);

        }else{

            System.out.println("New Thread");
            for(int i=0; i < arr.length; i++){
                //System.out.print(arr[i] + " ");
            }
            System.out.println();

            BubbleSort bubbleSort = new BubbleSort(arr);

            Thread t1 = new Thread(bubbleSort);

            t1.start();

            try	{
                t1.join();
            }	catch	(InterruptedException	IE)	{}

            doneArray = bubbleSort.getArr();
        }

        return doneArray;

    }
}
