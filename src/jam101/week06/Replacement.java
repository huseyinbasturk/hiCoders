package jam101.week06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Replacement {

    String partName;

    public Replacement(String name) {
        setPartName(format(name));
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String name) {
        this.partName = name;
    }
    /*
    soruda istenen tum 'string manipulation'lar buradan cagirarak yapiliyor, metot isimleri yaptiklari islemleri belirtiyor
     */
    private String format(String name) {
        return addDate(addBossName(reverseName(removeNumber( makeCapital(name)))));

    }

    private String makeCapital(String name) {
        return name.toUpperCase();
    }

    private String removeNumber(String name) {
        return name.replaceAll("[0-9]", "");
    }

    private String reverseName(String name) {
        String afterReverse = new String();
        for (int i = name.length() - 1; i >= 0; i--)
            afterReverse += name.charAt(i);
        return afterReverse;
    }

    private String addBossName(String name) {
        return "ASLIAG_" + name;
    }

    private String addDate(String name) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        return name.concat(date.format(f));
    }

}
