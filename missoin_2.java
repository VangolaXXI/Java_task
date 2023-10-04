import java.util.Random;
public class missoin_2 {
  
    public static void main(String[] args) {
        test(23, 10);
        test(generateRandomAge(), generateRandomtemp());
        test(generateRandomAge(), generateRandomtemp());
        test(generateRandomAge(), generateRandomtemp());
        test(generateRandomAge(), generateRandomtemp());
    }

    public static void test(int age, int temperature) {
        String result = canGoOutside(age, temperature);
        System.out.println("Возраст: " + age + " лет, Температура: " + temperature + " градусов - " + result);
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(71); // Генерируем случайный возраст от 0 до 70 лет
    }
     public static int generateRandomtemp() {
        Random random = new Random();
        return random.nextInt(51) - 20; // Генерируем случайную температуру от -20 до 30 градусов
    }
    

    public static String canGoOutside(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
            (age < 20 && temperature >= 0 && temperature <= 28) ||
            (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}

