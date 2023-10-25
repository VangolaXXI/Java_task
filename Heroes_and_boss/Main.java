public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса
        Boss boss = new Boss();

        // Задаем свойства босса
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Броня");

        // Распечатываем информацию о боссе
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());
        System.out.println("--------------");

        // Создаем экземпляры героев через метод createHeroes и сохраняем в массив
        Hero[] heroes = createHeroes();

        // Распечатываем информацию о каждом герое
        for (Hero hero : heroes) {
            System.out.println("Здоровье героя: " + hero.getHealth());
            System.out.println("Урон героя: " + hero.getDamage());
            System.out.println("Суперспособность героя: " + hero.getSuperPower());
            System.out.println("--------------");
        }
    }

    public static Hero[] createHeroes() {
        // Создаем 3х героев
        Hero hero1 = new Hero(100, 20, "Летать");
        Hero hero2 = new Hero(90, 25, "Невидимость");
        Hero hero3 = new Hero(110, 18);

        // Помещаем героев в массив
        Hero[] heroesArray = {hero1, hero2, hero3};

        return heroesArray;
    }
}
