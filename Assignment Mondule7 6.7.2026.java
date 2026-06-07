public class Student {

    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] courses;  

    // Constructor
    public Student(String name, int age, String email, String phoneNumber, String stage, String[] courses) {
        this.name = name;
        this.age = age;
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
    }

    // Method to print all student info
    public void printMe() {
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
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
                19,
                "alicia@example.com",
                "555-1234",
                "Freshman",
                new String[]{"Math 101", "English 102"}
        );

        // Student 2 — 4 courses
        Student s2 = new Student(
                "Marcus Lee",
                21,
                "marcus@example.com",
                "555-5678",
                "Junior",
                new String[]{"Biology 201", "Chemistry 210", "Statistics 150", "Sociology 101"}
        );

        // Student 3 — 6 courses
        Student s3 = new Student(
                "Keira Johnson",
                22,
                "keira@example.com",
                "555-9999",
                "Senior",
                new String[]{"CS 301", "CS 320", "CS 350", "Math 250", "Ethics 200", "History 110"}
        );

        // Print all students
        s1.printMe();
        s2.printMe();
        s3.printMe();
    }
}
