public class Krug extends GeometrijskiLik{


    private double radijus;

    public Krug( String naziv,double radijus) {
        super(naziv);
        this.radijus = radijus;
    }

   @Override
   public double povrsina(){
        return Math.pow(radijus,2)*Math.PI;
   }

   @Override
   public double opseg(){
        return 2*Math.PI*radijus;
   }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }
}
