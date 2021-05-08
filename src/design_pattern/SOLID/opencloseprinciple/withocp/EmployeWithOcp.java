package design_pattern.SOLID.opencloseprinciple.withocp;

public class EmployeWithOcp {
    private PaymentType paymentType;
    private String name;

    public EmployeWithOcp(PaymentType paymentType, String name) {
        this.paymentType = paymentType;
        this.name = name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
