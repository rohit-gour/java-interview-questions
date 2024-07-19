package Animal_Ex;

public class StudentImplention implements Student{

    public void getName(){
        System.out.println("Nihal here");
    }
    public static void main(String[] args) {
        Student s = new StudentImplention();
        s.getName();
    }
}
