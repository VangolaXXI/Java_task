public class Warrior extends Hero {
    Warrior(int health,int damage){
        super(health,damage,"super kick");
    }
    //реализация метода воина
    @Override
    public void applySuperAbility() {
        System.out.println("Воин применил суперспособность " + super.superAbilityType);
    }

}
