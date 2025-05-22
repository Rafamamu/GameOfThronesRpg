public class Personagem {

    private String name;
    private String house;
    private String skills;
    private Double health;

    public Personagem() {

    }

    public Personagem(String name,
                      String house,
                      String skills,
                      Double health) {
        this.name = name;
        this.house = house;
        this.skills = skills;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }

}