package payment;

import java.util.ArrayList;

public abstract class Customer {
    public String name;
    ArrayList<String>paymentHistory;
    public String information;

    public Customer(String name){
        this.name = name;
        paymentHistory = new ArrayList<String>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy PaymentStrategy,double amount){
    information = PaymentStrategy.getPaymentDetails() + " pay amount is " + String.valueOf(PaymentStrategy.pay(amount));
    paymentHistory.add(information);
    }

    public void showPaymentHistory(){
        for ( int i = 0 ; i < paymentHistory.size() ; i ++)
            System.out.println(paymentHistory.get(i));
    }
}
