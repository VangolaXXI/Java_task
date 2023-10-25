public class Hero {
    private int health;
    private int damage;
    private String superPower;

    // Конструктор с тремя параметрами
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    // Конструктор с двумя параметрами
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "Без суперспособности";
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
