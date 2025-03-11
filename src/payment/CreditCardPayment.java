package payment;

public class CreditCardPayment implements PaymentStrategy{
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String cardNumber,String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }

    @Override
    public String getPaymentDetails() {
        return "Pay with CreditCard " + "the holder name is : " + cardHolderName + " and the card number : " + cardNumber ;
    }
}
