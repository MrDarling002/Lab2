import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class PokemonBattle{
     public static void main(String[] args) {
        Battle b = new Battle();
        Latios p1 = new Latios("Чурка", 1);
        Gumshoos p3 = new Gumshoos("Понос", 1);
        Nidorina p5 = new Nidorina("Шкибидидоп", 1);
        Yungoos p2 = new Yungoos("Говно", 1);
        NidoranF p4 = new NidoranF("Голубой", 1);
        Nidoqueen p6 = new Nidoqueen("ТОмас шелби", 1);
        b.addAlly(p1);
        b.addAlly(p3);

        b.addFoe(p6);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p5);
        b.go();
    }
}