public class HotDrink extends Product{
    private int temperature;
    
        public HotDrink (String kind, double price, Long id, int temperature){
            super(kind, price, id);
            this.temperature=temperature;
            
        }
        public int getTemperature() {
            return temperature;
        }
    
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
       
        @Override
        public String toString() {
            return String.format("У "+getKind()+" цена: "+ getPrice()+" руб. "+" id: "+getId()+ " t="+getTemperature()+ " градусов");
        }
}
