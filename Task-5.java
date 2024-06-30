import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course 
{
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private int enrolledStudents;

    // Constructor
    Course(String courseCode, String title, String description, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    // Method to enroll a student
    public boolean enrollStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
            return true;
        } else {
            return false; // Course is full
        }
    }

    // Method to drop a student
    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }

    // Method to check if course is full
    public boolean isFull() {
        return enrolledStudents >= capacity;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("\u001B[36mCourse: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("------------------------------\u001B[0m");
    }
}

class Student {
    private int studentID;
    private String name;
    private List<Course> registeredCourses;

    // Constructor
    Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Getters
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    // Method to register for a course
    public boolean registerCourse(Course course) {
        if (!registeredCourses.contains(course) && !course.isFull()) {
            registeredCourses.add(course);
            return true;
        } else {
            return false; // Already registered or course is full
        }
    }

    // Method to drop a course
    public void dropCourse(Course course) {
        registeredCourses.remove(course);
        course.dropStudent();
    }

    // Method to display student's registered courses
    public void displayRegisteredCourses() {
        System.out.println("\u001B[36mRegistered Courses for " + name + " (ID: " + studentID + "):");
        for (Course course : registeredCourses) {
            System.out.println(course.getCourseCode() + " - " + course.getTitle());
        }
        System.out.println("------------------------------\u001B[0m");
    }
}

public class CourseDatabaseApp {
    private List<Course> courses;
    private List<Student> students;
    private Scanner scanner;

    // Constructor
    public CourseDatabaseApp() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a course
    public void addCourse(String courseCode, String title, String description, int capacity) {
        Course course = new Course(courseCode, title, description, capacity);
        courses.add(course);
    }

    // Method to add a student
    public void addStudent(int studentID, String name) {
        Student student = new Student(studentID, name);
        students.add(student);
    }

    // Method to display all courses
    public void displayAllCourses() {
        System.out.println("\u001B[36mAvailable Courses:\u001B[0m");
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }

    // Method to display all students
    public void displayAllStudents() {
        System.out.println("\u001B[36mAll Students:\u001B[0m");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentID() + ", Name: " + student.getName());
        }
    }

    // Method to simulate course registration process
    public void registerCourseForStudent() {
        displayAllCourses();
        System.out.print("\u001B[33mEnter student ID: \u001B[0m");
        int studentID = scanner.nextInt();
        System.out.print("\u001B[33mEnter course code to register: \u001B[0m");
        scanner.nextLine(); // Consume newline
        String courseCode = scanner.nextLine();

        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            boolean success = student.registerCourse(course);
            if (success) {
                System.out.println("\u001B[32mSuccessfully registered " + student.getName() + " for course " + course.getTitle() + "\u001B[0m");
            } else {
                System.out.println("\u001B[31mRegistration failed. Course may be full or student already registered.\u001B[0m");
            }
        } else {
            System.out.println("\u001B[31mStudent ID or Course Code not found.\u001B[0m");
        }
    }

    // Method to simulate course removal process
    public void removeCourseForStudent() {
        displayAllStudents();
        System.out.print("\u001B[33mEnter student ID: \u001B[0m");
        int studentID = scanner.nextInt();
        System.out.print("\u001B[33mEnter course code to drop: \u001B[0m");
        scanner.nextLine(); // Consume newline
        String courseCode = scanner.nextLine();

        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            student.dropCourse(course);
            System.out.println("\u001B[32mSuccessfully dropped " + course.getTitle() + " for student " + student.getName() + "\u001B[0m");
        } else {
            System.out.println("\u001B[31mStudent ID or Course Code not found.\u001B[0m");
        }
    }

    // Helper method to find student by ID
    private Student findStudentByID(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    // Helper method to find course by code
    private Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Main method to run the application
    public static void main(String[] args) {
        CourseDatabaseApp app = new CourseDatabaseApp();

        // Adding some sample courses
        app.addCourse("CSE101", "Introduction to Computer Programming", "Fundamentals of programming and algorithms", 30);
        app.addCourse("DLD201", "Digital Logic Design", "Improving academic and professional writing skills", 25);
        app.addCourse("MATH301", "Applied Linear Algebra", "Basic concepts of linear algebra and applications", 20);

        // Adding some sample students
        app.addStudent(1001, "Nishant");
        app.addStudent(1002, "Aliva");
        app.addStudent(1003, "Anushka");
        app.addStudent(1004, "Manash");
        app.addStudent(1005, "Ashok");

        // Simulating interactions
        app.registerCourseForStudent();
        app.registerCourseForStudent();
        app.removeCourseForStudent();

        // Displaying all courses and registered students
        app.displayAllCourses();
        app.displayAllStudents();
    }
}
