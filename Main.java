// Lovely Angela E. Daugdaug
// BSIT-2B
// November 2, 2026

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(
            "Juan Dela Cruz",
            "EMP001",
            "IT",
            25000.0
        );

        Employee emp2 = new Employee(
            "Maria Lopez",
            "EMP002",
            "HR",
            22000.0
        );

        Manager emp3 = new Manager(
            "Carlo Mendoza",
            "EMP003",
            "IT",
            45000.0,
            8
        );

        System.out.println("===== EMPLOYEE INFORMATION =====");
        emp1.displayInfo();

        System.out.println();

        emp2.displayInfo();

        System.out.println();

        System.out.println("===== MANAGER =====");
        emp3.displayInfo();

        System.out.println("\n===== UPDATED INFORMATION =====");

        emp2.setMonthlySalary(24000.0);

        System.out.println("Name: " + emp2.getName());
        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should monthlySalary be private, and what does the setter protect against?
 *
 * Answer: monthlySalary should be private to protect the
 *         employee's salary information. The setter prevents
 *         zero or negative salary values from being accepted.
 *
 * 2. Is a Manager also an Employee? Explain using the word extends.
 *
 * Answer: Yes, a Manager is also an Employee because the
 *         Manager class extends the Employee class. This means
 *         it inherits the attributes and methods of Employee.
 *
 * 3. What is the advantage of calling super.displayInfo() inside Manager's displayInfo()?
 *
 * Answer: It allows the Manager class to reuse the parent's
 *         displayInfo() method instead of rewriting the employee
 *         information. It can then add its own teamSize information.
 */
