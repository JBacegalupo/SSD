public interface Delivery {
    String getTutor() throws NoTutorException;
    public void setTutor(String Tutor);
    String getRoom() throws NoRoomException;
    public void setRoom(String Room);
}

