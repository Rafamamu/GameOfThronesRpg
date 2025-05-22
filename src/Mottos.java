public enum Mottos {

    STARK("winter is coming"),
    LANNISTER("Hear me Roar!"),
    TARGARYEN("Fire and Blood!"),
    BARATHEON("Ours is the Fury!!");



    private String description;

    Mottos(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
