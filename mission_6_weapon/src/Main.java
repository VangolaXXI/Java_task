public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр оружия
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Мурамаса");

        // Создаем экземпляр босса и задаем свойства
        Boss boss = new Boss("Усталый Босс", 1000, 50, bossWeapon);

        // Выводим информацию о боссе
        System.out.println(boss.printInfo());

        // Создаем два экземпляра скелета и задаем свойства
        Skeleton skeleton1 = new Skeleton("Скелет Красный", 100, 10, new Weapon(WeaponType.BOW, "Драконий Лук"), 20);
        Skeleton skeleton2 = new Skeleton("Скелет Черный", 120, 12, new Weapon(WeaponType.BOW, "Стальной Лук"), 15);

        // Выводим информацию о скелетах
        System.out.println("\nСкелет 1:\n" + skeleton1.printInfo());
        System.out.println("\nСкелет 2:\n" + skeleton2.printInfo());
    }
}
