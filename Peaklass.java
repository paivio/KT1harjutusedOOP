import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Peaklass {

    public static List<Sissekanne> loeSissekanded (String failinimi) throws Exception {
        List<String> read = Files.readAllLines(Path.of(failinimi));
        List<Sissekanne> kanded = new ArrayList<>();

        for (String rida : read) {
            String[] tükid = rida.split("; ");

            if (tükid.length == 1) {
                kanded.add(new Mõte(tükid[0]));
            }
            else if (tükid.length == 2) {
                kanded.add(new Ülesanne(tükid[0], Double.parseDouble(tükid[1])));
            } else {
                kanded.add(new Kohtumine(tükid[1], Double.parseDouble(tükid[2]), Integer.valueOf(tükid[0])));
            }
        }
        return kanded;
    }

    public static void main(String[] args) throws Exception {

        String failinimi = "sissekanded.txt";
        List<Sissekanne> testkanded = loeSissekanded(failinimi);
        Päevik päevik = new Päevik(testkanded);
        päevik.väljasta();


    }
}

