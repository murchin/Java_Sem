import java.util.ArrayList;
import java.util.List;

public abstract class Vending {

    private final List<Product> list;

    public Vending() {
        list = new ArrayList<>();

    }

    void addProduct(Product product) {
        list.add(product);

    }

    public List<Product> getList() {
        return list;
    }

   
    Product getProduct(String kind) {
        for (Product product : list) {
            if (kind.equals(product.getKind())) {
                return product;
            }
        }
        return null;
    }

    Product getProduct(Long id) {
        for (Product product : list) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }


    
}
