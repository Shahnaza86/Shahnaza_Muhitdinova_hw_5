public class Main {
    public static void main(String[] args) {




        Boss is = new Boss();
        is.setHealth(1000);
        is.setDamage(100);
        is.setDefense("armor");
        System.out.println("Boss:health" + is.getHealth() + "damage" + is.getDamage() +"defense" + is.getDefense());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getheroHealth()+createHeroes()[i].getheroDamage()+createHeroes()[i].getheroAbility());

        }
    }
    public static Hero[] createHeroes(){
        Hero mag = new Hero(500,80,"magic");
        Hero voin =new Hero(480,90);
        Hero medic = new Hero(300,70,"healing");
        Hero [] allHeroes = new Hero[]{mag,voin,medic};
        return allHeroes;
    }
}