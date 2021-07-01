package design_pattern.strategy.example02;

import design_pattern.strategy.example02.paymentstrategy.PaymentImplCreditCard;
import design_pattern.strategy.example02.paymentstrategy.PaymentImplPaypal;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        List<ShoppingItem> shoppingItems = new ArrayList<>();
        shoppingItems.add(new ShoppingItem("name1", "1", 10));
        shoppingItems.add(new ShoppingItem("name2", "2", 20));

        //payment with paypal
        PaymentImplPaypal paypal = new PaymentImplPaypal("azrindipu@gmail.com", "12345");
        ShoppingCart cart = new ShoppingCart(shoppingItems, paypal);
        cart.pay();

        //payment with credit card
        PaymentImplCreditCard creditCard = new PaymentImplCreditCard("12345", "12345");
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItems, creditCard);
        shoppingCart.pay();

    }
}
