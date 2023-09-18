package enumeracoes;

import java.util.Date;

public class Enumeracoes {

    public static void main(String[] args) {
        OrderStatuys order = new OrderStatuys(1080, new Date(), Enum.PENDING_PAYMENT);
    
        System.out.println(order);
       
    }
    
}
