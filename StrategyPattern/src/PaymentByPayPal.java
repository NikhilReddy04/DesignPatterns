public class PaymentByPayPal implements PaymentStrategy{
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        System.out.println("Getting User PayPal Details");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating paypal Details");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Sending a PayPal request for amount:"+amount);
    }
}
