public class Pravokutnik {

    private String naziv;
    private double stranicaA;
    private double stranicaB;


    public Pravokutnik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double izracunajPovrsinu(){
        return (stranicaA*stranicaB);
    }

    public double izracunajOpseg(){
        return (2*(stranicaA+stranicaB));
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
