public class OOP1 {

    public class Main {
        public static void main(String[] arge) {
            // Vending vending=new Vending();
            // Product product1= new Product("Apple",20,1L);
            // Product product2=new Product("Orange", 20, 2L);
            // Product product3=new Product("Banana", 25, 3L);
            // //product1.name="Apple";
            // vending.addProduct(product1);
            // vending.addProduct(product2);
            // vending.addProduct(product3);
            // System.out.println(vending.getProduct("Apple"));
            // Vending vending=new FrutVending();
            // Product product1= new Apple("Apple",20,1L);
            // Product product2=new Orange("Orange", 20, 2L);
            // Product product3=new Banana("Banana", 25, 3L);
            // vending.addProduct(product1);
            // vending.addProduct(product2);
            // vending.addProduct(product3);
            // System.out.println(vending.getProduct("Apple"));
            // System.out.println(vending.getProduct("Orange"));
            // System.out.println(vending.getProduct("Banana"));

            // System.out.println(vending.getProduct(1L));
            // System.out.println(vending.getProduct(2L));
            // System.out.println(vending.getProduct(3L));
            // System.out.println(vending.getProduct(5L));

            Product product1 = new HotDrink("Tea", 120, 10L, 80);
            Product product2 = new HotDrink("Coffe", 200, 11L, 85);
            Product product3 = new HotDrink("CoffeKappuchino", 250, 12L, 87);
            HotDrinkVending vending = new HotDrinkVending();
            vending.addProduct(product1);
            vending.addProduct(product2);
            vending.addProduct(product3);
            System.out.println(vending.getHotDrink(80));

        }
    }
}
