package isp.lab3.exercise5;
import java.util.Scanner;


public class Exercise5 {
private String[] product;
private int credit;
private int[] price;
public Exercise5(String[] product, int[] price) {
    this.product=product;
    this.price=price;
    this.credit=0;
}
public String[] displayProduct() {
    String[] array=new String[product.length];
    for(int i=0;i< product.length;i++) {
        array[i]=(i+1) + product[i];
    }
    return array;
}
    public void insertCoin(int value) {
        this.credit = this.credit + value;
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

    public void displayCredit() {
    System.out.println("Credit curent: " + credit);
    }

    public int getCredit() {
    return credit;
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
        String[] products = {"Coca-Cola", "Fanta", "Sprite", "Apa minerala", "Suc natural"};
        int[] prices = {5, 5, 5, 3, 8};
        Exercise5 vendingMachine = new Exercise5(products, prices);
        vendingMachine.userMenu();
    }
}
