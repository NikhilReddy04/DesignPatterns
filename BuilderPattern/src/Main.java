//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilderObj=new PhoneBuilder();

        Phone myPhone=phoneBuilderObj.setOs("IOS").setProcessor("A16").setRam(8).getPhone();
        System.out.println(myPhone.toString());
    }
}