public abstract class Sissekanne implements Comparable<Sissekanne>{

    private String kirjeldus;

    public Sissekanne(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public String kirjeldus() {
        return kirjeldus;
    }

    public abstract double kestus ();

    public int compareTo(Sissekanne o) {
        if (kestus() < o.kestus()) {
            return -1;
        }
        else if (kestus() > o.kestus()) {
            return 1;
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return kirjeldus + " " + kestus();
    }
}
