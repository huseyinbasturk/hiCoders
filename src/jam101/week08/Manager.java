package jam101.week08;

import java.util.ArrayList;

public class Manager {

    private final String APARTMENT_NAME = "Kaygisizlar Family Apartment";
    private final int ANNUAL_PAYMENT = 250*12;
    private Apartment apartment;

    /*
   Apartman daireleri ve her bir daire icin 12 adet aidat nesnesi olusturulacak
     */
    public void init() {
        System.out.println("---###-PAYMENT STATUS-###---");
        for (int i = 1; i <= 10; i++) {
            apartment = new Apartment();

            for (int j = 1; j <= 12; j++) {

                int payment = getRandomMoney();

                Subscription subscription;
                if (payment == 0) {
                    subscription = new Subscription(j);
                } else {
                    subscription = new Subscription(j, payment);
                }
                setValues(subscription);
            }
            System.out.println(getBalance(i));
        }

    }

    /*
    her bir dairenin aylik olarak odedigi miktar rastgele belirlenir
     */
    public int getRandomMoney() {
        return (int) (Math.random() * (500));
    }

    /*
    her bir dairenin aylik odedigi miktar arraylist e kaydedilir
     */
    public void setValues(Subscription subscription) {
        apartment.setValues(subscription);
    }

    /*
    yil sonu bilanco hesabi yapilir
     */
    public double calculate() {
        ArrayList<Subscription> values = apartment.getValues();
        double total = 0;
        for (Subscription s : values) {
            total += s.getPaidMoney();
        }
        return total - ANNUAL_PAYMENT;
    }

    /*
   yil sonu bilancoyu yazdirir
    */
    public String getBalance(int apartmentNumber) {
        return APARTMENT_NAME + " number " + apartmentNumber + " : " + calculate();
    }
}
