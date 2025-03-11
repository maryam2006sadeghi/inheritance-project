package payment;

public class RegularCustomer extends Customer{
    public String name;

    public RegularCustomer(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void displayCustomerInfo() {
        System.out.println("RegularCustomer " + name );
    }
}