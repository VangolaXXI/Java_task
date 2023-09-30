import java.util.Scanner;
public class mission_1 {
    public static void main(String[] args) {
//        1
    String a = "Этот мир не очень.";
//    2
    int NUM =69;
//    3
    String word = "Интернета";
//    4
        System.out.print(a + " Почему? "+" есть " + NUM + " причин из них первая потому что нет  " + word);
//        5
        String allwords = a+NUM+word;
        System.out.print(allwords);
//        6
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
//        7
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя:");

        String name = sc.nextLine();

        System.out.println("Привет человек по имени " + name);

    }
}
