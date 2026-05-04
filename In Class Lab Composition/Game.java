public class Game {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15, 3.5);
        Weapon bow = new Weapon("Bow", 10, 1.5);
 
        System.out.println(sword);
        System.out.println(bow);

        Inventory bag = new Inventory(3);
        bag.addWeapon(sword);
        bag.addWeapon(bow);
        
        System.out.println("Items in bag: " + bag.getCount());
        System.out.println("Total weight: " + bag.totalWeight() + " lbs");
        System.out.println(bag);
    }
}
