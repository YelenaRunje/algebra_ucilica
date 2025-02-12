public class Krug {

    private String naziv;
    private double radijus;

    public Krug(double radijus) {
        this.radijus = radijus;
    }

    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
