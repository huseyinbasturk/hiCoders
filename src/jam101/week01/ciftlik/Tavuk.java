package jam101.week01.ciftlik;

public class Tavuk {

    public static int toplamSayi;
    private String name;

    public Tavuk() {
        toplamSayi++;
        name = "tavuk + tavuk sayisi";
    }
    public Tavuk(String name) {
        toplamSayi++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tavuk  { name='" + name + '\'' + '}';
    }
}
