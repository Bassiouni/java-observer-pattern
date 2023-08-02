import java.util.ArrayList;

public class YoutubeChannel implements Publisher {
    private final ArrayList<Subscriber> subscribers;
    private final String name;

    public YoutubeChannel(String name) {
        this.subscribers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        this.subscribers.removeIf(subscriber -> s == subscriber);
    }

    @Override
    public void sendNotification() {
        subscribers.forEach(Subscriber::update);
    }

    public String getName() {
        return name;
    }
}
