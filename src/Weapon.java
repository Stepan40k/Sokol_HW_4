public class Weapon extends Equipment{
    public String name;
    public int damage;
    public int wear;

    public Weapon(String name, int damage, int wear){
        super(name, wear);
        this.damage = damage;
    }
    public void info(){
        System.out.println("Оружие "+this.name+" наносит урон "+this.damage+" и имеет прочность "+this.wear);
    }
}
