public class Armor extends Equipment{
    public String name;
    public int armor;
    public int wear;

    public Armor(String name, int armor, int wear){
        super(name, wear);
        this.armor = armor;
    }
    public void info(){
        System.out.println("Доспех "+this.name+" добавлять очков брони "+this.armor+" и имеет прочность "+this.wear);
    }
}
