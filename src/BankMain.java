import java.util.Arrays;
import java.util.Random;

public class BankMain {
    public static void main(String[] args) {
        Random random = new Random();
        String bankNamesString = "ПРИВАТБАНК,Сенс Банк,ІНГ Банк Україна,Укрексімбанк,Райффайзен Банк,ПУМБ,КРЕДІ АГРІКОЛЬ БАНК,КРЕДОБАНК,Банк Кредит Дніпро," +
        "Банк Восток,ТАСКОМБАНК,Універсал Банк,ПРАВЕКС-БАНК,ПІРЕУС БАНК МКБ";

        String [] bankNames = bankNamesString.split(",");
        double [] price  = new double[bankNames.length];
        Bank [] banks = new Bank[bankNames.length];

        for (int i = 0; i < bankNames.length; i++) {
            price[i] = random.nextDouble() * 5 + 35;
            Bank bank = new Bank(bankNames[i], price[i]);
            banks[i] = bank;
        }
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));

        for (int i = 0; i < banks.length; i++) {
            System.out.println(banks[i]);
        }
        System.out.println("____________________________________");
        for (int i = 0; i < banks.length; i++) {
            if(banks[i].price == price[banks.length - 1] ||
                    banks[i].price == price[banks.length - 2] ||
                    banks[i].price == price[banks.length - 3] ||
                    banks[i].price == price[banks.length - 4] ||
                    banks[i].price == price[banks.length - 5]){
                System.out.println("Краща ціна: " + banks[i]);
            }
        }

    }
}
