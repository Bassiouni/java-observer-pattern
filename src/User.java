public record User(String username) implements Subscriber {
    @Override
    public void update() {
        System.out.println("Notifying " + this.username);
    }
}
