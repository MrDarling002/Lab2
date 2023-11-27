package myskills;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED, 1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}