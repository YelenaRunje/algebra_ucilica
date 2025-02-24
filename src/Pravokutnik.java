public class Pravokutnik extends GeometrijskiLik{

    private int a;
    private int b;


    public Pravokutnik(String naziv,int a, int b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }


    @Override
    public double povrsina(){
        return (a * b);
    }

    @Override
    public double opseg(){
        return (2*(a + b));
    }


    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }
}
