public enum Mottos {

    STARK("winter is coming"),
    LANNISTER("Hear me Roar!"),
    TARGARYEN("Fire and Blood!"),
    BARATHEON("Ours is the Fury!!"),
    GREYJOY("We do not sow!"),
    MARTELL("Unbowed,Unbent,Unbroken"),
    TULLY("Family,Duty,Honor"),
    TYRELL("Growing Strong"),
    ARRYN("As High as Honor"),
    BOLTON("Our Blades are Sharp");





    private String description;

    Mottos(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }



}
