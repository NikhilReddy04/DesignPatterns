public class AppNotificationDecorator extends NotifierDecorator{
    public AppNotificationDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message){
        super.send(message);
        System.out.println("Sending App notification:"+message);
    }
}
