package jam101.week08;

public class Subscription {
    private int monthNumber;
    private double paidMoney;
    /*
    odeme yapilmadigi ay icin aidat nesnesi olusturur
     */
    public Subscription(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    /*
    odeme yapildigi ay icin aidat nesnesi olusturur
     */
    public Subscription(int month, double paidMoney) {
        this.monthNumber = month;
        this.paidMoney = paidMoney;
    }

    /*
    odeme miktarini cagirmak icin kullanilir
     */
    public double getPaidMoney() {
        return paidMoney;
    }
}
