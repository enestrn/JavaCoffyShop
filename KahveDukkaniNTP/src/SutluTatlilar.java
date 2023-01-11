
public class SutluTatlilar extends Urunler {
    public SutluTatlilar(String type, double price) {
        super(type, price);
    }

    @Override
    public String getDescription() {
        return "" + getType() + "";
    }
}