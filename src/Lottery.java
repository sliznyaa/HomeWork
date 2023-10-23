import java.util.Arrays;
import java.util.Random;

public class Lottery {
    static public void main (String[]args){
        Random random = new Random();
        int [] first = new int[7];
        int [] second = new int[7];
        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(9);
            second[i] = random.nextInt(9);
        }
        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println("Перший масив: " + Arrays.toString(first));
        System.out.println("Перший масив: " + Arrays.toString(second));

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if(first[i]==second[i]){
                count++;
            }
        }
        System.out.println("Збігів: " + count);
    }
}
