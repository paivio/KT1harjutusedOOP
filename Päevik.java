import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Päevik {

    private List<Sissekanne> sissekanded = new ArrayList<>();

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
        for (Sissekanne tegevus : sissekanded) {
            if (tegevus.kestus() > 0) {
                sissekanded.add(tegevus);
            }
        }
        Collections.sort(sissekanded);
        return sissekanded;
    }


}



