public abstract class Subject implements Delivery{
    private String name;
    private String description;
    String Tutor;
    String Room;

    abstract int getCredit();

    String getName() {
        return this.name;
    };
    String getDescription() {
         return this.description;
     };

    public String getTutor() throws NoTutorException {

        if ( Tutor == null ) {

            throw  new  NoTutorException();

        }
        return this.Tutor;

    }
    public String getRoom() throws NoRoomException {
        if ( Room == null ) {
            throw  new  NoRoomException();
        }
        return this.Room;

    }

    public void setTutor(String Tutor) {this.Tutor = Tutor;}
    public void setRoom(String Room) {this.Room = Room;}

    public Subject(String name, String description) {
        this.name = name;
        this.description = description;
    }
}


