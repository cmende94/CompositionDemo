public class Player {
    private String name;
    private int health;
    private Inventory bag;

    Player(String name, int health, int capacity){
        this.name = name;
        this.health = health;
        bag = new Inventory(capacity);
    }

    public void pickUp(Weapon w){
        String result = bag.addWeapon(w);
        if(result.equals("y")){
            System.out.println(name + " picked up " + w.getName());
        }
        else if(result.equals("full")){
            System.out.println("Inventory full");
        }
    }

    public Inventory getBag(){return bag;}

    public String toString(){
        return name + " (HP: " + health + ") " + "carrying " + bag.getCount() + " items.";
    }

}
