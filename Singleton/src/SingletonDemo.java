public class SingletonDemo {
    public static void main(String[] args) {
        Database obj1 = Database.getInstance();
        obj1.connectToDataBase();
        obj1.validateConnection();

        Database obj2 = Database.getInstance();
        System.out.println(obj1 == obj2);
    }
}