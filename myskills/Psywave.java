package myskills;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Psywave extends SpecialMove {
    public Psywave(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
        pow = 0.5 + Math.random(); 
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}