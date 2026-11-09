// Lovely Angela E. Daugdaug
// BSIT-2B
// November 2, 2026

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
            "Ana Cruz", "STU001", "BSIT", 2
        );

        Student student2 = new Student(
            "Mark Reyes", "STU002", "BSCS", 1
        );

        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3,
            "Full Scholar"
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student1.displayInfo();

        System.out.println();

        student2.displayInfo();

        System.out.println();

        System.out.println("===== COLLEGE STUDENT =====");
        student3.displayInfo();

        System.out.println("\n===== UPDATED INFORMATION =====");

        student1.setYearLevel(4);

        student1.displayInfo();

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should the attributes of Student be private instead of public?
 * 
 * Answer: Attributes should be private to protect the data
 *         and allow access only through public getters and setters.
 *
 * 2. What would happen if CollegeStudent did not call super(...) in its constructor?
 * 
 * Answer: The parent class constructor would not be properly
 *         initialized, resulting in a compilation error because
 *         Student does not have a no-argument constructor.
 *
 * 3. What is the benefit of overriding displayInfo() instead of writing a new method with a different name?
 * 
 * Answer: Overriding allows the child class to reuse the
 *         parent's method and add its own information while keeping
 *         the same method name.
 */
