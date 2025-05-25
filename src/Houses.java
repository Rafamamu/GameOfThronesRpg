public class Houses {


    private String name;
    private Mottos motto;


    public Houses() {

    }

    public Houses(String name, Mottos motto) {
        this.name = name;
        this.motto = motto;
    }


    @Override
    public String toString() {
        return " Da casa " +name+", e seu lema é "+ motto.getDescription()+".";

    }
}
