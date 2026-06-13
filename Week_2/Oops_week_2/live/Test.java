package Week_2.Oops_week_2.live;

import Week_2.Oops_week_2.music.Playable;
import Week_2.Oops_week_2.music.string.Veena;
import Week_2.Oops_week_2.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = veena;
        p.play();

        p = saxophone;
        p.play();
    }
}

