package mypokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myskills.Bulldoze;
import myskills.Facade;
import myskills.Psywave;
import myskills.ZenHeadbutt; 

public class Latios extends Pokemon{
    public Latios(String name, int Level) {
        super(name, Level);
        super.setType(Type.DRAGON, Type.PSYCHIC);
        super.setStats(80, 90, 80, 130, 110, 110);
        ZenHeadbutt zenHeadbutt = new ZenHeadbutt(80, 90);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        Psywave psywave = new Psywave(0 ,100);
        Facade facade = new Facade(70 ,100);
        super.setMove(zenHeadbutt, bulldoze, psywave, facade);

    }
}