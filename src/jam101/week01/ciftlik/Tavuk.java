package jam101.week01.ciftlik;

public class Tavuk {

    public static int toplamSayi;
    private String name;

    public Tavuk() {
        name = "tavuk + tavuk sayisi";
    }
    public Tavuk(String name) {
        this.name = name;
    }

    {
        toplamSayi++;
    }
    @Override
    public String toString() {
        return "Tavuk  { name='" + name + '\'' + '}';
    }
}
