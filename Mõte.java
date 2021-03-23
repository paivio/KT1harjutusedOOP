public class Mõte extends Sissekanne{

    public Mõte(String kirjeldus) {
        super(kirjeldus);
    }

    @Override
    public double kestus() {
        return 0;
    }

    @Override
    public String toString() {
        return super.kirjeldus();
    }
}
