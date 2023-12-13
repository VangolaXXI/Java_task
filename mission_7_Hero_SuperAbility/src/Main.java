// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //создание массива из трёх разных героев
        Hero[] heroes = {
            new Magic(100,20),
            new Medic(150,45,30),
            new Warrior(100,23)

        };
        //Применение значение каждого героя через цикл
        for ( Hero hero:heroes){
            hero.applySuperAbility();
            // Если герой - медик, увеличиваем опыт лечения

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }


    }

}