package payment;

public class PremiumCustomer extends Customer{
    public String name;

    public PremiumCustomer(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void displayCustomerInfo() {
        System.out.println("PermiumCustomer " + name );
    }
}
