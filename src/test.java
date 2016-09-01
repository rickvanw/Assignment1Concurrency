import java.util.ArrayList;

/**
 * Created by rickv on 31-8-2016.
 */
public class test {

    private ArrayList<Double> randomNumbers;


    public void sortRandom() {

        for (int i = 0; i < 25000; i++) {
            double random = Math.random();

            randomNumbers.add(i,random);

        }

        for (int i = randomNumbers.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomNumbers.get(j) > randomNumbers.get(j+1)) {
                    double temp = randomNumbers.get(j);
                    //randomNumbers.add(i);
                    //arg[j] = arg[j + 1];
                    //arg[j + 1] = temp;
                }
            }
        }

        //for (int i = 0; i < arg.length; i++) {
           // System.out.print(arg[i] + " ");
        }

    }


//}
