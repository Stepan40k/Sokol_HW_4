import java.util.ArrayList;

public class Unit {
    public String name;
    public int hp;
    public int attack;
    public int armor;
    public ArrayList bag;
    public int weapon_wear;
    public int clothes_wear;
    public int weapon_attack;
    public int clothes_armor;

    public Unit(String name, int hp, int attack, int armor){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.clothes_armor = 0; // Изначально юнит раздет
        this.weapon_attack = 0; // Изначально юнит безоружен
        this.bag = new ArrayList<>();
    }

    public void putOn(Weapon item){
            this.weapon_wear = item.wear;
            this.weapon_attack = item.damage;
            System.out.println(this.name + " взял в руки " + item.name);
    }

    public void putOn(Armor item){
        this.clothes_wear = item.wear;
        this.clothes_armor = item.armor;
        System.out.println(item.name+" защищает "+this.name);
    }


    public void attack (Unit target){

        if (target.clothes_wear < 0){
            target.clothes_armor = 0;
        }
        if (this.weapon_wear <= 0){
            this.weapon_attack = 0;
        }
        int full_damage = this.attack + this.weapon_attack;
        int damage = full_damage - (target.armor + target.clothes_armor);
        if (damage > 0){
            target.hp -= damage;
            target.clothes_wear -= (full_damage - damage);
            this.weapon_wear = this.weapon_wear<0 ? 0 : this.weapon_wear - (full_damage - damage);
            System.out.println(this.name+" наносит "+damage+" урона");
            System.out.println("Здоровье "+target.name+" "+target.hp);
            System.out.println("Броня "+target.name+" "+target.clothes_wear);
        } else {
            System.out.println("Броня не пробита!");
            target.clothes_wear -= full_damage;
            System.out.println("Броня " + target.name + " " + target.clothes_wear);
        }
        if (target.hp<=0)
            this.bag.addAll(target.bag);
    }

    public void info(){
        System.out.println("Юнит "+this.name+" имеет здоровье "+this.hp+" урон "+
                (this.attack+this.weapon_attack)+" броню "+(this.armor+this.clothes_armor));
    }
}
