package mypokemons;
import myskills.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon{
    public NidoranF(String name, int Level) {
        super(name, Level);
        super.setType(Type.POISON);
        super.setStats(55, 47, 52, 40, 40, 41);
        Venoshock venoshock = new Venoshock(65, 100);
        DoubleKick doubleKick = new DoubleKick(30, 100);
        super.setMove(venoshock, doubleKick);
    }    
}
