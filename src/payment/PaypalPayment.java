package payment;

public class PaypalPayment implements PaymentStrategy{
    public String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }

    @Override
    public String getPaymentDetails() {
        return "Pay with PayPal " +"email address : " + email;
    }
}
