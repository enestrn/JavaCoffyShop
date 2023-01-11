public abstract class Urunler  {
    protected String type;
    protected double price;

    public Urunler(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public abstract String getDescription();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}