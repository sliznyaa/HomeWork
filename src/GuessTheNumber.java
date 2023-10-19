import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Random numberToGuess = new Random();
        int a = numberToGuess.nextInt(10);
        int attempts = 3;

        System.out.println("Вгадайте число від 0 до 10. У вас є 3 спроби.");

        while (attempts > 0){
            System.out.print("Ваша спроба: ");
            int userGuess = scanner.nextInt();
            if (userGuess < 0 || userGuess > 10){
                System.out.println("Будь ласка, введіть число від 0 до 10.");
                continue;
            }if (userGuess == a){
                System.out.println("Ви вгадали! Число, яке загадав комп'ютер: " + a);
                break;
            }else{
                System.out.println("Спробуйте ще раз.");
                attempts--;
                System.out.println("Залишилось спроб: " + attempts);
            }
        if (attempts==0) {
            System.out.println("На жаль, ви не вгадали. Число, яке загадав комп'ютер: " + a);
            scanner.close();
        }


        }

    }

}

