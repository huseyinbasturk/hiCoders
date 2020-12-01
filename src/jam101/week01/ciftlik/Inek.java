package jam101.week01.ciftlik;

public class Inek {

    public static int toplamSayi;
    private String name;

    public Inek() {
        toplamSayi++;
        name = "inek + inek sayisi";
    }
    public Inek(String name) {
        toplamSayi++;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Inek{ name='" + name + '\'' + '}';
    }
}
