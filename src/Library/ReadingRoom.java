package Library;

public class ReadingRoom {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] b = new Book[2];

        p[0] = new Person("Candace", "Female", 21);
        p[1] = new Person("John", "Male", 27);

        b[0] = new Book(p[0], "Harry Potter and the Half-Blood Prince", "J.K. Rowling",672);
        b[1] = new Book(p[1], "Lord of the Rings: the two towers", "J.R.R. Tolkien", 352);

        b[0].openBook();
        b[0].leafThrough(10);
        b[0].advancePage();
        System.out.println(b[0].showDetails());
    }
}
