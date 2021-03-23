public class Kohtumine extends Ülesanne{

    private int algusaeg;

    public Kohtumine(String kirjeldus, double kestus, int algusaeg) {
        super(kirjeldus, kestus);
        this.algusaeg = algusaeg;
    }

    @Override
    public String kirjeldus() {
        return super.kirjeldus() + ", algusaeg kell " + Integer.toString(algusaeg);
    }

    @Override
    public String toString() {
        return kirjeldus();
    }
}
