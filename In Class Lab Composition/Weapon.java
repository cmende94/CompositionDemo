public class Weapon {
    private String name;
    private int damage;
    private double weight;

    public String getName() {return name;}
    public int getDamage() {return damage;}
    public double getWeight() {return weight;}

    Weapon(String name, int damage, double weight){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
    }

    public String toString(){
        return name + ": " + damage + "dmg, " + weight + "lbs";
    }

}
