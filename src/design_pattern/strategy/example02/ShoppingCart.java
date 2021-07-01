package design_pattern.strategy.example02;

import design_pattern.strategy.example02.paymentinterface.Payment;

import java.util.List;

public class ShoppingCart {
    private Payment payment;
    private List<ShoppingItem> shoppingItems;

    public ShoppingCart(List<ShoppingItem> shoppingItems, Payment payment){
        this.shoppingItems = shoppingItems;
        this.payment = payment;
    }

    public boolean pay(){
        boolean isPaid = false;
        int totalAmount =0;
        if(shoppingItems != null && shoppingItems.size() > 0){
            for(ShoppingItem item : shoppingItems){
                totalAmount+=item.getAmount();
            }
            payment.pay(totalAmount);
            isPaid=true;
        }
        return isPaid;
    }
}
