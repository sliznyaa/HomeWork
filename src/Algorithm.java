import java.util.Random;

public class Algorithm {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100_000)+11;

        System.out.println("Рандомне число = "+ randomNumber);

        int lengthNumber = String.valueOf(randomNumber).length();

        int sum = 0;
        for (int i = 0; i < lengthNumber; i++) {
            sum += randomNumber %10;
            randomNumber /= 10;
        }

        System.out.println("Сума рандомних чисел = " + sum);
        System.out.println("Довжина числа: "+ lengthNumber);
    }
}
