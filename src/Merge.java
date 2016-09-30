/**
 * Created by rickv on 8-9-2016.
 *
 * Class om twee arrays bij elkaar te voegen
 */
public class Merge {

    public static int[] Merge(int[] a, int[] b) {

        int[]c = new int[a.length+b.length];
        int i;
        for(i=0; i<a.length; i++)
            c[i] = a[i];

        for(int j=0; j<b.length; j++)
            c[i++]=b[j];
        return c;

    }

}
