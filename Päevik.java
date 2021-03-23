import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class Päevik {

    private List<Sissekanne> sissekanded;

    public Päevik(List<Sissekanne> sissekanne) {
        this.sissekanded = sissekanne;
    }

    public double koguKestus() {
        double summa = 0;
        for (Sissekanne kanne : sissekanded) {
            summa += kanne.kestus();
        }
        return summa;
    }

    public void väljasta() {
        for (Sissekanne kanne : sissekanded) {
            System.out.println(kanne);
        }
    }

    public List<Sissekanne> tegevusteAruanne() {
        List<Sissekanne> tegevused = new ArrayList<>();
        for (Sissekanne kanne : sissekanded) {
            if (kanne.kestus() > 0) {
                tegevused.add(kanne);
            }
        }
        Collections.sort(tegevused);
        return tegevused;
    }
}


