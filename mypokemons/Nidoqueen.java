package mypokemons;
import myskills.*;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int Level) {
        super(name, Level);
        super.setType(Type.POISON);
        super.setStats(70, 62, 67, 55, 55, 56);
        Scratch scratch = new Scratch(40, 100);
        super.addMove(scratch);
    }    
}
