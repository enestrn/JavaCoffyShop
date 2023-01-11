import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class CoffeeShop {
    private static List<Urunler> menu = new ArrayList<>();

    public static void main(String[] args) {
        menu.add(new Espresso(32.5));
        menu.add(new Americano(26.5));
        menu.add(new FilterCoffee(24));
        menu.add(new Latte(34));
        menu.add(new Mocha(35));
        menu.add(new ColdLatte(37.5));
        menu.add(new Frappe(42.5));
        menu.add(new CaramelFrappe(44.5));
        menu.add(new IcedAmericano(29.5));
        menu.add(new ChaiTeaLatte(45));
        menu.add(new HavucluKek(34.5));
        menu.add(new Brownie(34.5));
        menu.add(new CheeseCake(50));
        menu.add(new SanSebastianCheeseCake(60));
        menu.add(new MozaikPasta(42.5));
        menu.add(new Trilece(43.5));
        menu.add(new Magnolia(50));

        Scanner scanner = new Scanner(System.in);
        List<Urunler> order = new ArrayList<>();
        while (true) {
            System.out.println("**Kahve dukkanina hosgeldiniz!**");
            System.out.println("Menu: ");
            System.out.println("***Kahveler ve Tatlilar***");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i+1) + ". " + menu.get(i).getDescription() + ": " + menu.get(i).getPrice() + "TL ");
            }


            System.out.println("Lutfen siparis etmek istediginiz urunun numarasini tuslayiniz veya odeme yapmak icin 0'i tuslayiniz: ");
            int selection = scanner.nextInt();
            if (selection == 0) {
                break;
            }
            else if (selection > 0 && selection <= menu.size()) {
                order.add(menu.get(selection-1));
            }
            else {
                System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
            }
        }
        if (order.isEmpty()) {
            System.out.println("Hicbir sey siparis etmediniz.");
        }
        else {
            double totalPrice = 0;
            System.out.println("Siparisiniz: ");
            for (Urunler c : order) {
                System.out.println(c.getDescription() + ": " + c.getPrice()  + "TL ");
                totalPrice += c.getPrice();
            }
            System.out.println("Toplam Fiyat: " + totalPrice + "TL");
            System.out.println("*İyi günler :)* Tekrar Bekleriz...");
        }
    }
}