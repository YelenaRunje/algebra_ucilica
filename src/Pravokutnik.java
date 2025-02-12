public class Pravokutnik {

    private String naziv;
    private double stranicaA;
    private double stranicaB;


    public Pravokutnik( String naziv,double stranicaA, double stranicaB) {
        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double izracunajPovrsinu(){
        return (stranicaA*stranicaB);
    }

    public double izracunajOpseg(){
        return (2*(stranicaA+stranicaB));
    }
}
