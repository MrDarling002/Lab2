package myskills;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;

public class Rest extends StatusMove{
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
