
public class Kekler extends Urunler {
    public Kekler(String type, double price) {
        super(type, price);
    }

    @Override
    public String getDescription() {
        return "" + getType() + "";
    }
}