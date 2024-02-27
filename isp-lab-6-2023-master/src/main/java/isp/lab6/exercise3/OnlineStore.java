package isp.lab6.exercise3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class OnlineStore {
    private List<Product> products;
    private Map<String,ActiveSession> sessions;

    public List<Product> getProducts() {
        return products;
    }
    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProduct=new ArrayList<>(products);
        sortedProduct.sort(sortCriteria);
        return sortedProduct;
    }

    public void addToCart(String username, Product product, int quantity) {
     ActiveSession activeSession=sessions.get(username);
     if(activeSession==null) {
         activeSession=new ActiveSession(username);
         sessions.put(username,activeSession);
     }
     activeSession.addToCart(product.getName(),quantity);
    }
    public String checkout(String username) {
       ActiveSession activeSession=sessions.get(username);
       if(activeSession==null) {
           return "Error";
       }
       List <Product> cart= (List<Product>) activeSession.getShoppingChart();
       if(cart.isEmpty()) {
           return "Cart is empty";
       }
       double price=0;
       for(Product product:cart) {
           price=price+product.getPrice();
       }
       activeSession.setShoppingChart((Map<String, Integer>) new ArrayList<>());
       return "Price is: "+price;
    }
    public void addSession(String username) {
        sessions.put(username,new ActiveSession(username));
    }
    public void removeSession(String username) {
        sessions.remove(username);
    }
}
