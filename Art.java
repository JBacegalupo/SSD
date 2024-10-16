public class Art extends Subject {
    public Art() {
        super("Art" , "A subject involving the creation of paintings and sculptures");

    }

    @Override
    int getCredit() {
        return 25;
    }

}

