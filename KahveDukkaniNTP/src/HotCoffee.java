
public class HotCoffee extends Urunler {
    public HotCoffee(String type, double price) {
        super(type, price);
    }

    @Override
    public String getDescription() {
        return "Sicak " + getType() + "";
    }
}