package jam101.week06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String allReplacements[] = {"horn23", "pedalSet111", "saddle136", "bikeGear41"};
        List<Replacement> spareParts = new ArrayList<>();

        for (int i = 0; i < allReplacements.length; i++) {
            spareParts.add(new Replacement(allReplacements[i]));
            System.out.println(spareParts.get(i).getPartName());
        }
    }
}
