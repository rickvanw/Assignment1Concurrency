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
                    randomNumbers.add(i, randomNumbers.get(j+1));
                    randomNumbers.add((j + 1), temp);
                }
            }
        }

        for (int i = 0; i < randomNumbers.size(); i++) {
            System.out.print(randomNumbers.get(i) + " ");
        }

    }


}
