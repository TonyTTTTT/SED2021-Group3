
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Stuednt {
    String stuedntName;
    Set<Course> courses;
    Set<Professor> professor;

    public Stuednt(String stuedntName) {
        this.stuedntName = stuedntName;
        this.courses = new HashSet<>();
        this.professor = new HashSet<>();
    }
    public void addProfessor(Professor professor){
        this.professor.add(professor);
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
}

class Course {
    String courseName;
    Set<Stuednt> stuednts;
    Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.stuednts = new HashSet<>();
    }
    public void addProfessor(Professor professor){
        this.professor = professor;
    }
    public void addStudent(Stuednt stuednt){
        this.stuednts.add(stuednt);
    }
}

class Professor {
    String professorName;
    Set<Stuednt> stuednts;
    Set<Course> courses;

    public Professor(String professorName){
        this.professorName = professorName;
        this.stuednts = new HashSet<>();
        this.courses = new HashSet<>();
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
    public void addStudent(Stuednt stuednt){
        this.stuednts.add(stuednt);
    }
}

public class Problem11  {

    public static void main(String[] argv){
        Professor professorA = new Professor("professorA");
        Course courseA = new Course("CourseA");
        Stuednt studentA = new Stuednt("StudentA");
        professorA.addCourse(courseA);
        courseA.addProfessor(professorA);

        studentA.addCourse(courseA);
        studentA.addProfessor(courseA.professor);

        courseA.addStudent(studentA);
        professorA.addStudent(studentA);

    }
}


