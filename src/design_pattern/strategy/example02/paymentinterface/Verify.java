package design_pattern.strategy.example02.paymentinterface;

public interface Verify {
    boolean verifyAccount(String identity, String password);
}
