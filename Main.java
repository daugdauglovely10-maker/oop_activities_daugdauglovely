public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(
            "Noli Me Tangere",
            "Jose Rizal",
            "ISBN-001",
            350.00
        );

        Book book2 = new Book(
            "El Filibusterismo",
            "Jose Rizal",
            "ISBN-002",
            320.00
        );

        EBook book3 = new EBook(
            "Florante at Laura",
            "Francisco Balagtas",
            "ISBN-003",
            150.00,
            "PDF"
        );

        System.out.println("===== BOOK INFORMATION =====");
        book1.displayInfo();

        System.out.println();

        book2.displayInfo();

        System.out.println();

        System.out.println("===== E-BOOK =====");
        book3.displayInfo();

        System.out.println("\n===== UPDATED INFORMATION =====");

        book2.setPrice(299.50);

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why is it better to change the price through setPrice() instead of making price public?
 *
 * Answer: Using setPrice() protects the price attribute
 *         and allows validation to prevent negative prices.
 *
 * 2. Which members does EBook inherit from Book, and which does it add on its own?
 *
 * Answer: EBook inherits the title, author, isbn, price,
 *         getters, setters, and displayInfo() method from Book.
 *         It adds its own fileFormat attribute and its getter
 *         and setter.
 *
 * 3. If the library later adds an AudioBook class, how would inheritance make that easier?
 *
 * Answer: AudioBook can extend Book and reuse its existing
 *         attributes, constructor, getters, setters, and methods.
 *         It only needs to add its own specific attributes
 *         and methods.
 */
