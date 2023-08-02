// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        YoutubeChannel ytChannel = new YoutubeChannel("YouTube");
        User ahmed = new User("ahmed");
        User ali = new User("Ali");

        ytChannel.subscribe(ahmed);
        ytChannel.subscribe(ali);

        ytChannel.sendNotification();
        System.out.println("---------------------------------------");
        ytChannel.unsubscribe(ali);
        ytChannel.sendNotification();
    }
}
