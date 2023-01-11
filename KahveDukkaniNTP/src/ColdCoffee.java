public class ColdCoffee extends Urunler {
    public ColdCoffee(String type, double price) {
        super(type, price);
    }

    @Override
    public String getDescription() {
        return "Soguk " + getType() + "";
    }
}