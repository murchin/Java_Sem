import java.util.ArrayList;
import java.util.List;

public class HotDrinkVending extends Vending {

    List<HotDrink> listHotDrink;

    public HotDrinkVending() {
        listHotDrink = new ArrayList<>();
    }

    void addHotDrink(List<HotDrink> list1, List<Product> list) {
        getList();
        listHotDrink.addAll(list);
    }

    HotDrink getHotDrink(int temperature) {

        for (HotDrink product : listHotDrink) {
            if (temperature == product.getTemperature()) {
                return product;
            }
        }
        return null;
    }
}
