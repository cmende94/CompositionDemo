public class Inventory {
    private int count;
    private Weapon[] weapons;
    Inventory(int size){
        count = 0;
        weapons = new Weapon[size];
    }

    public void addWeapon(Weapon w){
        if(count < weapons.length){
            weapons[count] = w;
            count++;
        }
        else{
            System.out.println("Inventory full");
        }
    }

    public int getCount(){return count;}

    public double totalWeight(){
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += weapons[i].getWeight();
        }
        return sum;
    }

    public String toString(){
        String returnString = "";
        for (int i = 0; i < count; i++) {
            returnString += weapons[i] + "\n";
        }
        return returnString;
    }

}
