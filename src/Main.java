public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(270, 20, "MAGICAL"),
                new Medic(250, 0, "HEAL", 20),
                new Warrior(290, 25, "CRITICAL MAGIC")
        };

        for (Hero hero : heroes) {
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();


            }
        }
    }
}