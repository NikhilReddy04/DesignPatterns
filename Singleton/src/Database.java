public class Database {
    private static Database instance; // Private static instance

    // Step 2: Private constructor to prevent external instantiation
    private Database() {
        System.out.println("Singleton Instance Created");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void connectToDataBase(){
        System.out.println("Connecting to database.....");
    }

    public void validateConnection() {
        System.out.println("Connected to Db server....");
    }
}