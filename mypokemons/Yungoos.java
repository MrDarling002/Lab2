package mypokemons;
import myskills.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yungoos extends Pokemon{
    public Yungoos(String name, int Level) {
        super(name, Level);
        super.setType(Type.NORMAL);
        super.setStats(48, 70, 30, 30, 30, 40);
        Tackle tackle = new Tackle(40, 80);
        Rest rest = new Rest(0, 1);
        SuperFang superFang = new SuperFang(0 ,90);
        super.setMove(tackle, rest, superFang);
    }    
}
