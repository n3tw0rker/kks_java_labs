public class Student extends Person {
    String id_group;

    public Student(String id_group) {
        this.id_group = id_group;
    }

    @Override
    public String toString() {
        return id_group;
    }
}
