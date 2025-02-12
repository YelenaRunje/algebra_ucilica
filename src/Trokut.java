public class Trokut  {

    private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;


    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        this.naziv = naziv;
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
}
