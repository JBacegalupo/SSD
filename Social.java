public abstract class Social extends Subject {
    public Social(String name, String description) {
        super(name, description);
    }

    @Override
    int getCredit() {
        return 50;
    }
}
