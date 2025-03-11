package payment;

public class BitcoinPayment implements PaymentStrategy{
    public String walletAddress;

    public BitcoinPayment(String wallwtAddress){
        this.walletAddress = wallwtAddress;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }

    @Override
    public String getPaymentDetails() {
        return "Pay with Bitcoin " + "wallwtAddress : " + walletAddress;
    }
}
