package p1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroup {

    private Student[] studentList = new Student[4];

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public Student findStudentBySurname(String surname) {
        return Arrays.stream(studentList)
                .filter(student -> student.getSurname().equals(surname))
                .findAny().get();
    }

    public void removeStudent(Student studentToRemove) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].equals(studentToRemove)) {
                studentList[i] = null;
                return;
            }
        }
    }

    public void addNewStudent(Student studentToAdd) throws NoPlacesLeftException {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = studentToAdd;
                return;
            }
        }
        throw new NoPlacesLeftException("There are no places left in this group!");
    }

    public void saveGroupToAFile() throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task31\\src\\main\\resources\\student-group.txt");

            for (Student s : studentList) {
                writer.write(s.toString() + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    @Override
    public String toString() {
        String result = "";

        List<Student> resultingList = Arrays.stream(studentList)
                .filter(student -> student != null)
                .sorted(Comparator.comparing(Student::getSurname))
                .collect(Collectors.toList());

        for (Student s : resultingList) {
            result  += s.toString();
        }

        return result;
    }
}
