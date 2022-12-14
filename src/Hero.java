public class Hero {
    private int heroHealth;

    public int getheroHealth() {
        return heroHealth;
    }

    public int getheroDamage() {
        return heroDamage;
    }

    public String getheroAbility() {
        return heroAbility;
    }

    private int heroDamage;
    private String heroAbility;

public Hero(int heroHealth,int heroDamage,String heroAbility){
    this.heroHealth = heroHealth;
    this.heroDamage = heroDamage;
    this.heroAbility = heroAbility;

}
    public Hero(int health,int damage){
        this.heroHealth =heroHealth;
        this.heroDamage = heroDamage;


    }
}
