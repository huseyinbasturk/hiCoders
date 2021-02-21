package jam101.warehouse;

public class WarehouseManager {

    private Warehouse warehouse;

    public WarehouseManager(){
      warehouse = new Warehouse();
      init();

      System.out.println(warehouse.search("Metal Product 2"));
    }

    private void init(){
      try{
        loadData();
      } catch(Exception e){
        System.out.println(e.getMessage());
      }
    }

    private void loadData() throws Exception{
      String [] shelves = { "Furniture", "Metal", "Garden", "Salon"};
      for (String shelfName : shelves) {
        Shelf shelf = new Shelf();
        shelf.setName(shelfName);
        shelf.setCapacity(100);
        addProduct(shelf, shelfName);
        warehouse.addShelf(shelf);
      }
    }

    private void addProduct(Shelf raf, String rafName) throws Exception {
      for (int i = 0; i < 10; i++) {
        Product product = new Product();
        product.setName(rafName + " Product " + i+1);
        product.setWeight(8);
        raf.addProduct(product, 1);
      }
    }


}
