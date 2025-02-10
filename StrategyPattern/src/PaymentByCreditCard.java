public class PaymentByCreditCard implements PaymentStrategy{
    private String cardNo;
    private int cvv;
    String cardUserName;


    @Override
    public void collectPaymentDetails() {
        System.out.println("Take card details");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating card details");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Sending a request for amount of:"+amount);
    }
}
