public class Trokut extends GeometrijskiLik {

    private int a;
    private int b;
    private int c;


    public Trokut(String naziv,int stranicaA, int b, int c) {
        super(naziv);
        this.a = stranicaA;
        this.b = b;
        this.c = c;
    }
    @Override
    public double povrsina() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double opseg() {
        return (a + b + c);
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }

}
