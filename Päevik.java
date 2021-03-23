import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Päevik {

    private double kestus;

    private List<Sissekanne> sissekanded = new ArrayList<>();

    public Päevik(List<Sissekanne> sissekanne) {
        this.sissekanded = sissekanne;
    }

    public List<Sissekanne> tegevusteAruanne(Sissekanne sissekanne) {
        if (kestus > 0) {
            sissekanded.add(sissekanne);
        }
        Collections.sort(sissekanded);
        return sissekanded;
    }

    public void väljasta() {
        for (Sissekanne kanne : sissekanded) {
            System.out.println(kanne);
        }
    }



}


