package design_pattern.strategy.example02.paymentstrategy;

import design_pattern.strategy.example02.paymentinterface.Payment;
import design_pattern.strategy.example02.paymentinterface.Verify;

public class PaymentImplPaypal implements Payment, Verify{

    private String email;
    private String password;

    public PaymentImplPaypal(String email, String password) {
        this.email = email;
        this.password = password;
        this.verifyAccount(this.email, this.password);
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by paypal");
    }

    @Override
    public boolean verifyAccount(String identity, String password) {
        return true;
    }
}
