public class Main {
    public static void main(String[] args) {
        System.out.println("***************************************");

        Krug krug1 = new Krug("krug1", 5);
        Trokut trokut1 = new Trokut("trokut1", 2, 3, 3);
        Pravokutnik pravokutnik1 = new Pravokutnik("pravokutnik1", 2, 4);

        Učilica ucilica = new Učilica();
        ucilica.dodajLikove(krug1);
        ucilica.dodajLikove(trokut1);
        ucilica.dodajLikove(pravokutnik1);
        ucilica.dodajLikove(new Krug("krug2", 12));
        ucilica.dodajLikove(new Trokut("trokut2", 2, 2, 2));
        ucilica.dodajLikove(new Pravokutnik("pravokutnik2", 2, 5));

        ucilica.ispisiLikove();
        System.out.println("\n");
        ucilica.sortirajLikove();

        System.out.println("Likovi sortirani po površini uzlazno:\n");
        ucilica.ispisiLikove();
    }
}
