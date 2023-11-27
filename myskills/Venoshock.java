package myskills;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
    public Venoshock(double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status Pok = def.getCondition();
        if (Pok.equals(Status.POISON)){
        def.setMod(Stat.HP, (int) Math.round(damage));
        }
}
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}