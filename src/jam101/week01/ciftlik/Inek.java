package jam101.week01.ciftlik;

public class Inek {

    public static int toplamSayi;
    private String name;

    public Inek() {
        name = "inek + inek sayisi";
    }
    public Inek(String name) {
        this.name = name;

    }

    {
        toplamSayi++;
    }

    @Override
    public String toString() {
        return "Inek{ name='" + name + '\'' + '}';
    }
}
