package isp.lab3.exercise6;
import java.util.Scanner;

public class Exercise6 {
    private static Exercise6 a = null;
    private String[] product;
    private int credit;
    private int[] price;
    private Exercise6() {
        this.product=new String[]{"Coca-Cola", "Fanta", "Sprite", "Apa", "Suc natural"};
        this.price = new int[]{10, 10, 10, 5, 15};
        this.credit=0;
    }
    public static Exercise6 getA() {
        if(a==null) {
            a = new Exercise6();
        }
        return a;
    }
    public void displayProduct() {
        System.out.println("Produse disponibile: ");
        for (int i = 0; i < product.length; i++) {
            System.out.println((i + 1) + product[i]);
        }
    }
        public void insertCoin(int value) {
            this.credit = this.credit + value;
        }
        public void displayCredit() {
            System.out.println("Credit curent: " + credit);
        }
        public String selectProduct(int id) {
            if(id<1||id> product.length)
            {
                return "Selectia produsului nu este valida";
            }
            int price1=price[id-1];
            if(price1>credit) {
                return "Credit insuficient";
            }
            String product1=product[id-1];
            credit=credit-price1;
            return product1;
        }
    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selectati o optiune: ");
            System.out.println("1 Produsele disponibile");
            System.out.println("2 Introduceti banii");
            System.out.println("3 Creditul curent");
            System.out.println("4 Selectati un produs");
            System.out.println("5 Iesire");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    System.out.println("Introduceti valoarea monedei (1, 5, 10 sau 50): ");
                    int coinValue = scanner.nextInt();
                    insertCoin(coinValue);
                    break;
                case 3:
                    displayCredit();
                    break;
                case 4:
                    System.out.println("Introduceti ID-ul produsului: ");
                    int productId = scanner.nextInt();
                    selectProduct(productId);
                    break;
                case 5:
                    System.out.println("La revedere!");
                    return;
                default:
                    System.out.println("Optiunea introdusa nu este valida!");
            }
        }

    }
    public static void main(String[] args) {
        Exercise6 vendingMachine = Exercise6.getA();
        vendingMachine.userMenu();
    }
    }
