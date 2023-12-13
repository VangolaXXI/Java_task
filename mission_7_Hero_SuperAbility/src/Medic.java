public class Medic extends Hero{
    double healPoints;

    Medic(int health,int damage,int healPoints){
        super(health,damage,"treat quickly");
        this.healPoints = healPoints;
    }
    void  increaseExperience(){
        healPoints *= 1.1;
    }
    //реализация метода Медик
    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил суперспособность " + super.superAbilityType);
    }

}
