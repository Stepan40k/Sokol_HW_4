public class Game {
    public static void main(String[] args){
        Unit orche = new Unit("Орче", 100, 50, 20);
        Unit elf = new Unit("Эльф", 80, 30,15);

        Armor breastPlate = new Armor("Кираса", 40, 50);
        Armor leatherPants = new Armor("Кожаные штанцы", 10, 25);
        Weapon sword = new Weapon("Стальной меч", 30, 50);
        Weapon dagger = new Weapon("Кинжал", 12, 23);

        breastPlate.info();

        // Наденем лут на героев
        orche.putOn(breastPlate);
        orche.putOn(dagger);
       // elf.putOn(sword);
       // elf.putOn(leatherPants);

       orche.info();
      //  elf.info();


       // orche.attack(elf);

    }
}
