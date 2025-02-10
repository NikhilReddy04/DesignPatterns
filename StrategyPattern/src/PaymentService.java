public class PaymentService {
    private int cost;
    private boolean deliveryCostIncluded=false;
    PaymentStrategy strategy;

    public void setDeliveryCostIncluded(boolean deliveryCostIncluded) {
        this.deliveryCostIncluded = deliveryCostIncluded;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void processOrder(){
        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails()){
            strategy.pay(cost);
        }
    }
}
