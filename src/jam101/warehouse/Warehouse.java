package jam101.warehouse;

import java.util.ArrayList;
import java.util.Optional;

public class Warehouse {

    private ArrayList<Shelf> shelves;

    public Warehouse(){
      shelves = new ArrayList<>();
    }

    public void addShelf(Shelf shelf){
      shelves.add(shelf);
    }

    public String search(String text){
      Optional<Shelf> found = shelves.stream()
          .filter(a -> a.getListItems()
              .stream()
              .anyMatch(b-> doesContainSearchedText(text, b)))
          .findFirst();

      return found.isPresent() ? found.get().getName() : "Not found";
    }

    private boolean doesContainSearchedText(String text, ListItem b) {
      return b.getProduct()
          .getName()
          .contains(text);
    }

}
