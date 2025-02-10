//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Notifier notifier=new BasicNotifier();
    notifier.send("Hello");

    System.out.println("\nAdding email notification\n");

    notifier=new EmailDecorator(notifier);
    notifier.send("Hello");

    System.out.println("\nAdding app notification\n");

    notifier=new AppNotificationDecorator(notifier);
    notifier.send("Hello");

    }
}