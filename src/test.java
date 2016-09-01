import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * Created by rickv on 31-8-2016.
 */
public class test {

    private ArrayList<Integer> randomNumbers;


    public void sortRandom() {

        randomNumbers = new ArrayList<>();

        for (int i = 0; i < 25000; i++) {

            Random random = new Random();

            int getal = random.nextInt(25000);

            randomNumbers.add(getal);

        }

        for (int i = 0; i < randomNumbers.size(); i++) {
            System.out.println(randomNumbers.get(i) + " ");
        }

        for (int i = randomNumbers.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomNumbers.get(j) > randomNumbers.get(j+1)) {
                    int temp = randomNumbers.get(j);
                    randomNumbers.add(i, randomNumbers.get(j+1));
                    randomNumbers.add((j + 1), temp);
                }
            }
        }
        System.out.println(" ");

        for (int i = 0; i < randomNumbers.size(); i++) {

            System.out.print(randomNumbers.get(i) + " ");
        }

    }


}
