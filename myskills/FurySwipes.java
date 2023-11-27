package myskills;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove{
    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        int chance = (int) (2 + 3 * Math.random());
        p.setMod(Stat.HP, (int) (damage*chance));
    }
    
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
