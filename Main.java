public class Main {
    public static void main(String[] args) {



        Subject [] subjectArray = new Subject[5];
        Maths m1 = new Maths();
        m1.setTutor("D.Trump");
        m1.setRoom("The white house");
        subjectArray[0] = m1;
        Art a1 = new Art();
        a1.setTutor("Salvador Dali");
        a1.setRoom("Figueres");
        subjectArray[1] = a1;
        Chemistry c1 = new Chemistry();
        c1.setTutor("Rishi sunak");
        c1.setRoom("10 downing street");
        subjectArray[2] = c1;
        Geography g1 = new Geography();
        g1.setTutor("test 3");
        g1.setRoom("101");
        subjectArray[3] = g1;
        Languages l1 = new Languages();
        subjectArray[4] = l1;



        for (int i = 0; i < subjectArray.length; i++) {

                System.out.println(subjectArray[i].getName());
                System.out.println(subjectArray[i].getDescription());
                System.out.println(subjectArray[i].getCredit());
                try {
                    System.out.println(subjectArray[i].getTutor());
                } catch (NoTutorException e) {
                    System.out.println(e.getMessage());
                }
                try {
                    System.out.println(subjectArray[i].getRoom());
                }
                catch (NoRoomException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
        }