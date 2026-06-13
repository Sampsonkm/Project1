public class DateOfBirth {

    private int month;
    private int day;
    private int year;

    public DateOfBirth(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getDOB() {
        return month + "/" + day + "/" + year;
    }
}

public class Student {

    private String name;
    private DateOfBirth dob;   // Composition replaces age
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] courses;

    // Static counter
    private static int studentCount = 0;

    // Constructor
    public Student(String name, DateOfBirth dob, String email, String phoneNumber, String stage, String[] courses) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;

        // Ensure max of 6 courses
        if (courses.length > 6) {
            System.out.println("A student can only register up to 6 courses. Trimming the list.");
            String[] trimmed = new String[6];
            for (int i = 0; i < 6; i++) {
                trimmed[i] = courses[i];
            }
            this.courses = trimmed;
        } else {
            this.courses = courses;
        }

        // Increment static counter
        studentCount++;
    }

    // Static method to return total students
    public static int getTotalStudents() {
        return studentCount;
    }

    // Print method
    public void printMe() {
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dob.getDOB());
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);
        System.out.println("Registered Courses:");

        if (courses.length == 0) {
            System.out.println("  None");
        } else {
            for (String course : courses) {
                System.out.println("  - " + course);
            }
        }

        System.out.println("--------------------------------------------------\n");
    }

    // Main method to test
    public static void main(String[] args) {

        // Student 1 — 2 courses
        Student s1 = new Student(
                "Alicia Brown",
                new DateOfBirth(3, 14, 2005),
                "alicia@example.com",
                "555-1234",
                "Freshman",
                new String[]{"Math 101", "English 102"}
        );

        // Student 2 — 4 courses
        Student s2 = new Student(
                "Marcus Lee",
                new DateOfBirth(7, 22, 2003),
                "marcus@example.com",
                "555-5678",
                "Junior",
                new String[]{"Biology 201", "Chemistry 210", "Statistics 150", "Sociology 101"}
        );

        // Student 3 — 6 courses
        Student s3 = new Student(
                "Keira Johnson",
                new DateOfBirth(11, 5, 2002),
                "keira@example.com",
                "555-9999",
                "Senior",
                new String[]{"CS 301", "CS 320", "CS 350", "Math 250", "Ethics 200", "History 110"}
        );

        // Print all students
        s1.printMe();
        s2.printMe();
        s3.printMe();

        // Display total number of students
        System.out.println("Total Students Created: " + Student.getTotalStudents());
    }
}

