import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random team = new Random();
        int sum = 0;
        System.out.println("Команда 1");
        for (int i = 0; i < 25; i++) {
            int age = team.nextInt(22) + 18;
            System.out.println("Гравець №"+i+" " + age + " років");
            sum +=age;
        }
        double averageAge = (double) sum / 25;
        System.out.println("Середній вік гравців: " + averageAge);
        Random team2 = new Random();
        int sum2 =0;
        System.out.println("Команда 2");
        for (int i = 0; i < 25; i++) {
            int age2 = team.nextInt(22) + 18;
            System.out.println("Гравець №"+i+" "+ age2+ " років");
            sum2 +=age2;
        }
        double averageAge2 = (double) sum2 / 25;
        System.out.println("Середній вік гравців: " + averageAge2);
    }
}


