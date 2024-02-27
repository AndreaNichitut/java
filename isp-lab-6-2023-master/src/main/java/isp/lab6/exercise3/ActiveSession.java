package isp.lab6.exercise3;

import java.util.Map;

public class ActiveSession {
    private String username;
    private Map<String,Integer> shoppingChart;

    public ActiveSession(String username) {
        this.username = username;
    }

    public void addToCart(String product, int quatity) {
     if(shoppingChart.containsKey(product)) {
         int currentQuantity=shoppingChart.get(product);
         shoppingChart.put(product,currentQuantity+quatity);
     }
     else
     {
         shoppingChart.put(product,quatity);
     }
    }

    public Map<String, Integer> getShoppingChart() {
        return shoppingChart;
    }

    public void setShoppingChart(Map<String, Integer> shoppingChart) {
        this.shoppingChart = shoppingChart;
    }
}
