public class Phone {
    private String os;
    private String processor;
    private int ram;
    private int storage;
    private int width;
    private int length;

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public Phone(String os, String processor, int ram, int storage, int width, int length) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.width = width;
        this.length = length;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
