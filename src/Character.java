public class Character {

    private String name;
    private String house;
    private Integer army;
    private Integer health;
    private Mottos motto;


    public Character() {

    }

    public Character(String name,String house,Integer army,Integer health,Mottos motto) {
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
    public Integer getArmy() {
        return army;
    }
    public Integer getHealth() {
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
    public void setArmy(Integer army) {
        this.army = army;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }
    public void setMotto(Mottos motto) {
        this.motto = motto;
    }



    @Override
    public String toString() {
        return "Eu sou "+name+"\n "+
                "da casa "+house+",\n " +
                "meu exército tem o poder de " +
                ""+army+" homens,\n"+
                " e o lema da minha casa é : "+motto.getDescription();
    }













}
