import payment.*;

public class Main{
    public static void main(String[] args){
        PremiumCustomer premiumCustomer1 = new PremiumCustomer("Maryam");
        PremiumCustomer premiumCustomer2 = new PremiumCustomer("Shirin");
        RegularCustomer regularCustomer = new RegularCustomer("Zhina");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("12345678" );
        CreditCardPayment creditCardPayment = new CreditCardPayment("123","Maryam");
        PaypalPayment paypalPayment = new PaypalPayment("sadeghimaryam199@gmail.com");

        premiumCustomer1.displayCustomerInfo();
        premiumCustomer2.displayCustomerInfo();
        regularCustomer.displayCustomerInfo();

        System.out.println("----------------------------------------------------");

        premiumCustomer1.makePayment(bitcoinPayment,1000);
        premiumCustomer2.makePayment(creditCardPayment,2000);
        regularCustomer.makePayment(paypalPayment,3000);
        premiumCustomer1.makePayment(creditCardPayment,4000);
        premiumCustomer2.makePayment(paypalPayment,5000);
        regularCustomer.makePayment(bitcoinPayment,6000);

        System.out.println("premiumCustomer1 payments:");
        premiumCustomer1.showPaymentHistory();
        System.out.println("----------------------------------------------------");

        System.out.println("premiumCustomer2 payments:");
        premiumCustomer2.showPaymentHistory();
        System.out.println("----------------------------------------------------");

        System.out.println("regularCustomer payments:");
        regularCustomer.showPaymentHistory();
        System.out.println("----------------------------------------------------");
    }
}