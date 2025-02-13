//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class YouTube {
    public static void main(String[] args) {
        Subscriber s1=new Subscriber("Nikhil");
        Subscriber s2=new Subscriber("Naruto");
        Subscriber s3=new Subscriber("Sasuke");

        Channel anime=new Channel();

        s1.subscribe(anime);
        s2.subscribe(anime);
        s3.subscribe(anime);

        anime.addSubscriber(s1);
        anime.addSubscriber(s2);
        anime.addSubscriber(s3);

        anime.removeSubscriber(s3);

        anime.uploadVideo("Naruto vs Sasuke");

        }
    }
