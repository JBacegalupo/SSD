public abstract class Science extends Subject {

    public Science(String name, String description) {
        super(name, description);
    }

    @Override
    int getCredit() {
        return 100;
    }


}