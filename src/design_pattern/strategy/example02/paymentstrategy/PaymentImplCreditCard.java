package design_pattern.strategy.example02.paymentstrategy;

import design_pattern.strategy.example02.paymentinterface.Payment;
import design_pattern.strategy.example02.paymentinterface.Verify;

public class PaymentImplCreditCard implements Payment, Verify {

    private String cardNumber;
    private String password;

    public PaymentImplCreditCard(String cardNumber, String password){
        this.cardNumber = cardNumber;
        this.password = password;
        this.verifyAccount(this.cardNumber, this.password);
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by credit card");
    }

    @Override
    public boolean verifyAccount(String identity, String password) {
        return true;
    }
}
