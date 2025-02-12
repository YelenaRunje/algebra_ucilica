public class Krug {

    private String naziv;
    private double radijus;

    public Krug(String naziv,double radijus) {
        this.naziv = naziv;
        this.radijus = radijus;
    }

    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }

}
