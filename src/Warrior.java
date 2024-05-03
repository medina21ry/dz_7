public class Warrior extends Hero{
    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("The warrior used the super ability CRITICAL DAMAGE");
    }
}
