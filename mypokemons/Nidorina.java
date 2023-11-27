package mypokemons;
import myskills.*;
import ru.ifmo.se.pokemon.Type;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int Level) {
        super(name, Level);
        super.setType(Type.POISON);
        super.setStats(70, 62, 67, 55, 55, 56);
        FurySwipes furySwipes = new FurySwipes(18,80);
        super.addMove(furySwipes);
    }    
}
