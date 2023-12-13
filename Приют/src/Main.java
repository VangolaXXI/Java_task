public class Main {
    public static void main(String[] args) {
        Shelter shelter1 = new Shelter("Собачье счастье", "ул. Солнечная, 123");
        Shelter shelter2 = new Shelter("Лапки и хвосты", "пер. Драконий, 456");

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Беретта", "Золотистый ретривер", Color.GRAY, shelter1);
        Dog dog3 = new Dog("Босс", "Немецкая овчарка", Color.BLACK, shelter2, new String[]{"Сидеть", "Лежать"});

        System.out.println("Информация о собаке 1: " + dog1.getInfo());
        System.out.println("Информация о собаке 2: " + dog2.getInfo());
        System.out.println("Информация о собаке 3: " + dog3.getInfo());

        System.out.println("Голос собаки 1");
        dog1.makeVoice("Гав!", 3);

        System.out.println("Голос собаки 2:");
        dog2.makeVoice("Лай!", 2);

        System.out.println("Голос собаки 3:");
        dog3.makeVoice("Гав-гав!", 1);
    }
}
