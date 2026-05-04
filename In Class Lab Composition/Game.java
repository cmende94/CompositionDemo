public class Game {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15, 3.5);
        Weapon bow = new Weapon("Bow", 10, 1.5);
        Weapon dagger = new Weapon("Dagger", 5, 0.5);
         
        Player hero = new Player("Hero", 100, 5);
         
        hero.pickUp(sword);
        hero.pickUp(bow);
        hero.pickUp(dagger);
         
        System.out.println();
        System.out.println(hero);
        System.out.println("Total weapon weight: " + hero.getBag().totalWeight() + " lbs");
        System.out.println();
        System.out.println("--- Loadout ---");
        System.out.println(hero.getBag());
    }
}
