//Concrete component

public class BasicNotifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("Sending message:"+message);
    }
}
