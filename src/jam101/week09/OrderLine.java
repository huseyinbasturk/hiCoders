package jam101.week09;

public class OrderLine {

    Product product;
    private int productQuantity;
    private double totalItemPrice;

    /*
    siparis listesini olusturu
     */
    public OrderLine(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
        this.totalItemPrice = product.getProductPrice() * productQuantity;


    }

    /*
    stoktaki miktari duzenler, satin alinan urunler listesine ekler
     */
    public void prepareItem() {
        product.setStockVolume(product.getStockVolume() - productQuantity);
        OrderedProduct.addToList(new OrderLine(this.product,this.productQuantity));
        OrderedProduct.calculateTotalPrice(this.totalItemPrice);

    }

    /*
    alinan urunun miktarina gore her bir urun icin odenecek fiyati getirir
     */
    public double getTotalItemPrice() {
        return totalItemPrice;
    }

    /*
    hangi urunden ne kadar alindigini yazdirir
     */
    public static void printOrderList() {
        for(OrderLine order : OrderedProduct.getOrderLineList()) {
            System.out.println("You bought " + order.productQuantity + " from " + order.product.getProductName());
        }
    }
}
