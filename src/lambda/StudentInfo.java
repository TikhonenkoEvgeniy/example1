package lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentOverGrade(students, 8);
        studentInfo.printStudentUnderAge(students, 30);
        studentInfo.printStudentMixCondition(students, 20, 9.5, 'f');
    }

    void printStudentOverGrade(ArrayList<Student> students, double grade) {
        System.out.println("Over grade: ");
        for (Student s : students) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> students, int age) {
        System.out.println("Under age: ");
        for (Student s : students) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
        System.out.println("Mix condition: ");
        for (Student s : students) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }

    void testStudents(ArrayList<Student> students, StudentsCheck sc) {
        System.out.println("Student checks: ");
        for (Student s : students) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentsCheck {
    boolean check(Student student);
}

class CheckOverGrade implements StudentsCheck {

    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}
