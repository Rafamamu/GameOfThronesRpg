import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CharacterFactory {

    private  static  final Map<String, Function<String, Character>> characterMap = new HashMap<>();

    static {
        characterMap.put("jon",name -> new Stark(name,"Stark", 5000, 100,Mottos.STARK));
    }










}
