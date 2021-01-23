package jam101.week08;

import java.util.ArrayList;
import java.util.List;

public class Apartment {

    private List<Subscription> values = new ArrayList<>();

    /*
    odenen miktarlari bilanco hesabi yapilirken cagirmak icin yazilmistir
     */
    public ArrayList<Subscription> getValues() {
        return (ArrayList) values;
    }

    /*
    aylik odenen miktarlari kaydeder
     */
    public void setValues(Subscription subscription) {
        values.add(subscription);
    }
}
