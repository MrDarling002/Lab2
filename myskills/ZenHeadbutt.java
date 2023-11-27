package myskills;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        double chance = Math.random();
        if (chance >= 0.2){
            Effect.flinch(p);
    }
}
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}