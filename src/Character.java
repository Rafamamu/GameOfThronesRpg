public class Character {

    private String name;
    private String house;
    private String skills;
    private Double health;

    public Character() {

    }

    public Character(String name,
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
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public Double getHealth() {
        return health;
    }
    public void setHealth(Double health) {
        this.health = health;
    }

}