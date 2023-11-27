package myskills;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status Pok = def.getCondition();
        if (Pok.equals(Status.BURN) || Pok.equals(Status.POISON) || Pok.equals(Status.PARALYZE)){
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}

