package jam101.week09;

public class Main {
    /*
    OnlineSale class objesi uretip o class taki metotlari calistirir
    */

    public static void main(String[] args) {

        OnlineSale onlineSale = new OnlineSale();
        onlineSale.init();
        onlineSale.buyProduct("Bread",1);
        onlineSale.buyProduct("Sugar",2);
        onlineSale.buyProduct("Fish",4);
        onlineSale.buyProduct("Rice",3);
        onlineSale.buyProduct("Egg",2);

        onlineSale.printShoppingReport();

        


    }



}
