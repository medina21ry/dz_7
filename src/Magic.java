public class Magic extends Hero{
    public Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("The magician used MAGICAL super ability");
    }
}
