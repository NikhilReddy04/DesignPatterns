public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name){
        this.name=name;
    }

    public void subscribe(Channel channel){
        this.channel=channel;
    }


    //This method of subscriber is invoked by a method in channel class
    public void notifyUser(){
        System.out.println("Heyy "+name+" new video uploaded!");
    }
}
