
public class App {
    public static void main(String[] args) {
        PaymentService paymentObj=new PaymentService();
        paymentObj.setStrategy(new PaymentByCreditCard());
        paymentObj.setCost(90000);
        paymentObj.processOrder();
        }
    }
