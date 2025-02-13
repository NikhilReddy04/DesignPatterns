import java.util.ArrayList;

public class Channel {
    private String title;
    private ArrayList<Subscriber>subs=new ArrayList<>();

    public void addSubscriber(Subscriber sub){
        subs.add(sub);
    }

    public void removeSubscriber(Subscriber sub){
        subs.remove(sub);
    }

    public void notifyUser(){
        for(Subscriber sub:subs){
            sub.notifyUser();
        }
    }

    public void uploadVideo(String title){
        this.title=title;
        this.notifyUser();
    }



}
