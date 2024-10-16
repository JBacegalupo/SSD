public class NoRoomException extends SubjectException{
    public NoRoomException() {
        super("no Room available to teach subject in");
    }
}
