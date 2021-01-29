package jam101.week09;

public class OnlineSale {

   Stock stock;
   int counter;
   int totalQuantity;

   /*
   10 farkli urunluk stok olusturur.
    */
   public void init() {
      new Stock().createStock();

   }

   /*
   secilen urunun stokta olup olmama durumuna gore alisveris listesine ekler, yeteri kadar yoksa mesaj yazdirir,
    */
   public void buyProduct(String name, int quantity) {

      if(Stock.checkStock(name, quantity) != null) {
         counter++;
         totalQuantity += quantity;
         OrderLine order = new OrderLine(Stock.checkStock(name, quantity), quantity);
         order.prepareItem();

      } else {
         System.out.println("We do not have enough " + name + " in the stock.");
      }

   }

   /*
   alisveris sonunda hangi urunden ne kadar alindigi, ne kadar odenmesi gerektigini ve son stok durumunu yazdirir
    */
   public void printShoppingReport() {
      System.out.println("=====================");
      System.out.println("You bought " + counter + " different items." );
      System.out.println("=====================");
      OrderLine.printOrderList();
      System.out.println("=====================");
      System.out.println("You are going to pay " + OrderedProduct.getTotalPrice() + " CHF.");
      System.out.println("=====================");
      new Stock().printStockList(); //son stok durumu

   }


}
