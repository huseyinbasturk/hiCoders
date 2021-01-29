package jam101.week09;

import java.util.ArrayList;

public class Stock {

    private static ArrayList<Product> productList = new ArrayList<>();

    /*
    Product classinda obje uretip arraylistte tutar.
    Urunun ozelligine gore birim miktarlari verilmistir.
    yumurta 10'luk kutu,
    sut, zeytinyagi 1 lt,
    tereyagi 1 paket,
    diger urunler 1 kg
     */
   public void createStock() {

       addToList(new Product("Sugar",0.98));
       addToList(new Product ("Cheese",3.45));
       addToList(new Product("Milk",1.25));
       addToList(new Product("Egg",2.19));
       addToList(new Product("Butter",3.35));
       addToList(new Product("Flour",0.89));
       addToList(new Product("OliveOil",6.85));
       addToList(new Product("Fish",4.52));
       addToList(new Product("Rice",1.19));
       addToList(new Product("Salt",0.45));
       printStockList();  //ilk ve son stok durumlari arasindaki farki gostermek icin yazilmistir

   }

   /*
   olusturdugumuz urunleri stok listesine ekler
    */
   public void addToList(Product product) {
       productList.add(product);


   }

    public void printStockList() {
        for(Product p : productList) {
            System.out.println(p.getProductName() + " --> " + p.getStockVolume());
        }
    }

    /*
    urunun stokta olup olmadiginin kontrolu yapilir
     */
    public static Product checkStock(String name, int quantity) {

        for (Product p : productList) {
            if (name.equals(p.getProductName())) {
                if (p.getStockVolume() >= quantity) {
                    return p;
                } else {
                    System.out.print("We do not have that amount(" + quantity + ") from " + p.getProductName() + ". We just have " + p.getStockVolume() + " of them(" + p.getCreateDate() + "). "); //bu tarih itibariyle stok durumunu gostersin hem de tarihi kullanmis olalim :)
                }
            }
        }
        return null;
    }
}
