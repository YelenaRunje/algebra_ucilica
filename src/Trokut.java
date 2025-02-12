public class Trokut  {

    private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;


    public Trokut(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    public double izracunajPovrsinu() {
        double s = (stranicaA + stranicaB + stranicaC) / 2;
        return Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
    }


    public double izracunajOpseg() {
        return (stranicaA + stranicaB + stranicaC);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
