public class Ülesanne extends Sissekanne{

    private double kestus;

    public Ülesanne(String kirjeldus, double kestus) {
        super(kirjeldus);
        this.kestus = kestus;
    }

    @Override
    public String kirjeldus() {
        return super.kirjeldus() + ", ajakulu " + Double.toString(kestus) + " minutit";
    }

    public double kestus() {
        return kestus;
    }

    @Override
    public String toString() {
        return kirjeldus();
    }
}
