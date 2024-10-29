package NewProject;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private static final List<Student> students = new ArrayList<>();

    public static void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void clearAllStudents() {
        students.clear();
        System.out.println("All the things are clear");
    }

    // Method to check if the student list is empty
    public static boolean isEmpty() {
        return students.isEmpty();
    }

    public static Student findStudentById(Integer incomingId) {
        for (Student student : students) {
            if (student.getId().equals(incomingId)) {
                return student;
            }
        }
        return null;


        //TODO: incoming id
        // iterate array list, if any student's id is equals incoming id
        // get that student and return;
    }

    public static boolean removeStudentById(Integer incomingId2) {
        for (Student student : students) {
            if (student.getId().equals(incomingId2)) {
                return students.remove(student);
            }

        }
        return false;

    }

    public static boolean containsStudentById(Integer incomingId2) {
        for (Student student : students) {
            if (student.getId().equals(incomingId2)) {
                return students.contains(student);
            }
        }
        return false;
    }

    public static boolean updateStudent(Integer incomingId, String newName, Double newGrade, Integer newAge) {
        Student student = findStudentById(incomingId);
        if (student != null){
            if (newName != null) student.setName(newName);
            if (newAge != null) student.setAge(newAge);
            if (newGrade != null)student.setGrade(newGrade);
            return true;
        }
        return false;


    }
}
