
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("101");
        Student student2 = new Student("102");
        Student student3 = new Student("103");

        MyVector<Student> students = new MyVector<>(10);

        //добавляем третьего студента два раза, чтобы показать работу метода удаления ВСЕХ элементов равных заданному

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);

        System.out.println("Массив студентов показывающий их id");
        System.out.println(students);

        students.removeAll(student3);
        System.out.println("Массив студентов, после удаления всех студентов student3");
        System.out.println(students);
    }
}
