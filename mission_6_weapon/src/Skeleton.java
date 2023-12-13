class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(String name, int health, int damage, Weapon weapon, int arrowCount) {
        super(name, health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Имя: " + getName() + "\n" +
                "Здоровье: " + getHealth() + "\n" +
                "Урон: " + getDamage() + "\n" +
                "Оружие: " + getWeapon().getName() + " (" + getWeapon().getType() + ")\n" +
                "Кол-во стрел: " + arrowCount;
    }
}
