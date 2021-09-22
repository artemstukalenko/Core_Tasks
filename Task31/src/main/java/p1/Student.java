package p1;

import java.util.Objects;

public class Student extends Human {

    private int course;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student(String name, String surname, int age, int course) {
        super(name, surname, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course && name == student.name
                && surname == student.surname && age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course, name, surname, age);
    }
}
