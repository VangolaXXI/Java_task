public abstract class Hero implements HavingSuperAbility {
   int health;
   int damage;
   String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Герой применил суперспособность " + superAbilityType);
    }

}
