package myskills;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleKick extends PhysicalMove{
    public DoubleKick(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, damage);
        super.applyOppDamage(p, damage); 
    }
    
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
