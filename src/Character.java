public class Character {

    private String name;
    private String house;
    private Double army;
    private Double health;
    private Mottos motto;


    public Character() {

    }

    public Character(String name,String house,Double army,Double health,Mottos motto) {
        this.name = name;
        this.house = house;
        this.army = army;
        this.health = health;
        this.motto = motto;

    }

    public String getName() {
        return name;
    }
    public String getHouse() {
        return house;
    }
    public Double getArmy() {
        return army;
    }
    public Double getHealth() {
        return health;
    }
    public Mottos motto() {
        return motto;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public void setArmy(Double army) {
        this.army = army;
    }
    public void setHealth(Double health) {
        this.health = health;
    }
    public void setMotto(Mottos motto) {
        this.motto = motto;
    }
}
