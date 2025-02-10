public class PhoneBuilder {
    private String os;
    private String processor;
    private int ram;
    private int storage=128;
    private int width=400;
    private int length=700;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public PhoneBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,processor,ram,storage,width,length);
    }
}
