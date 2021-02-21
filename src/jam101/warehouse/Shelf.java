package jam101.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private double capacity;
    private String name;
    private ArrayList<ListItem> listItems;

    public Shelf(){
      listItems = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) throws Exception{
      if(isOverloaded(product, quantity)){
        throw new Exception("You have reached the max capacity, plz remove the last item");
      }
      listItems.add(new ListItem(product, quantity));
    }

    private boolean isOverloaded(Product product, int adet) {
      double totalWeight = 0;
      for(ListItem item : listItems){
        totalWeight += item.getProduct().getWeight() * item.getQuantity();
      }
      totalWeight += (product.getWeight() * adet);

      return totalWeight > getCapacity();
    }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  public void setListItems(ArrayList<ListItem> listItems) {
    this.listItems = listItems;
  }

  public List<ListItem> getListItems(){
      return listItems;
    }



    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


}
