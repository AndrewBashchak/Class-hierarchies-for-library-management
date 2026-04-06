public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Andrew Bashchak",2006);
        Author author2 = new Author("Dmytro Svitlyk",2006);

        Book book1 = new Book("How to scam people", author1, 2020);
        Book book2 = new Book("Tactics for throwing smoke grenades in CS2", author2, 2025);
        ElectronicBook eBook = new ElectronicBook("Phrases taken out of context", author1, 2026, "MP3", 60.55);

        Department genre1 = new Department("Degradation (:");
        Department genre2 = new Department("Instructive");

        Library library = new Library("Easy Ainur", "Yevhen Konovalets Street, 35", 2026);

        Student student = new Student("Ksenia");
        Guest guest = new Guest("Victoria");

        book1.addReview(new Rating(5));
        book1.addReview(new Rating(1));
        book2.addReview(new Rating(4));

        library.addDepartment(genre1);
        library.addDepartment(genre2);

        genre1.addBook(book1);
        genre2.addBook(book2);
        library.addBook(eBook, genre1);

//        genre1.removeBook(eBook);
//        library.removeBook(book2, genre2);

//        student.borrowBook(genre2, book2);
        guest.borrowBook(genre1, eBook);
        guest.borrowBook(genre1, book1);

        library.getInfo();

        student.getBorrowedBooks();
        guest.getBorrowedBooks();
    }
}
