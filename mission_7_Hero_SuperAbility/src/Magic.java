public class Magic extends Hero {
    Magic(int health, int damage) {
        super(health, damage, "Magic Attack");
    }
    //реализация метода мага
    @Override
    public void applySuperAbility() {
        System.out.println("Магия применил суперспособность " + super.superAbilityType);
    }
}











