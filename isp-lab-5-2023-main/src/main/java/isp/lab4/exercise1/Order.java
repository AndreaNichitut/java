package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private Double totalPrice;

    public Order(String orderId, LocalDateTime date, Double totalPrice) {
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = totalPrice;
    }
}
