package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Exercise1 {

    public static void main(String[] args) {
        Product product= new Product("1234","colet1",50.89,ProductCategory.FASHION);
        Customer customer=new Customer("aa","bb","0729656543");
        Address address=new Address("aba","cdc");
        Order order=new Order("0987", LocalDateTime.now(),100.89);
    }
}
