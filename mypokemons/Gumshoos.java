package mypokemons;
import myskills.*;
import ru.ifmo.se.pokemon.Type;


public class Gumshoos extends Yungoos{
    public Gumshoos(String name, int Level) {
        super(name, Level);
        super.setType(Type.NORMAL);
        super.setStats(88, 110, 60, 55, 60, 45);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        super.addMove(bulldoze);
    }    
}
