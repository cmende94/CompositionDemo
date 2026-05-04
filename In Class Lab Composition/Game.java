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

    Weapon shield = new Weapon("Shield", 0, 8.0);
    Weapon staff = new Weapon("Staff", 12, 2.0);
    Weapon hammer = new Weapon("Hammer", 20, 6.0);
 
    hero.pickUp(shield);
    hero.pickUp(staff);
    hero.pickUp(hammer);   // Should be rejected — bag is full
    
    System.out.println();
    System.out.println(hero);

    }
}
