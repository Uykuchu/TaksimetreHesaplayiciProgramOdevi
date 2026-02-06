import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double taxiKilometerPrice = 25;
        double totalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taxi Kilometresi Giriniz: ");
        double km = scanner.nextDouble();
        totalPrice = km * taxiKilometerPrice;
        if (totalPrice <= 100) {
            totalPrice = 100;
            System.out.println("Taxi ücretlendirmesi: "+ totalPrice+ " Liradır");
        }else if (totalPrice > 100) {
            System.out.println("Taxi ücretlendirmesi: "+ totalPrice+ " Liradır");
        }
    }
}