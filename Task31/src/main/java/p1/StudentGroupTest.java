package p1;

import java.io.IOException;

public class StudentGroupTest {

    private static Student st1;
    private static Student st2;
    private static Student st3;
    private static Student st4;

    public static void main(String[] args) {

        initStudents();

        Student[] students = new Student[]{st1, st2, st3, st4};

        StudentGroup group = new StudentGroup();
        group.setStudentList(students);

        System.out.println(group.findStudentBySurname("Kovalchuk"));

        System.out.println("--------------------------");

        group.removeStudent(st2);

        System.out.println(group);

        try {
            group.addNewStudent(st2);
            group.addNewStudent(st2);
        } catch (NoPlacesLeftException e) {
            System.err.println(e.getMessage());
        }

        try {
            group.saveGroupToAFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void initStudents() {
        st1 = new Student("Ivan", "Ivanov", 20, 3);
        st2 = new Student("Elena", "Kovalchuk", 20, 3);
        st3 = new Student("Olha", "Marchenko", 20, 3);
        st4 = new Student("Oleg", "Kustenko", 20, 3);
    }
}
