package Library;

public class Book implements Publication{
    private Person reader;
    private String tittle, author;
    private int pages, currentPage;
    private boolean open;

    public Book(Person reader, String tittle, String author, int pages) {
        this.reader = reader;
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
        this.setOpen(false);
        this.setCurrentPage(0);
    }

    public String showDetails() {
        return "Book: " + "\n" +
                "reader: " + reader.getName() + "\n" +
                "age: " + reader.getAge() + "\n" +
                "sex: " + reader.getSex() + "\n" +
                "tittle: " + tittle + "\n" +
                "author: " + author + "\n" +
                "pages: " + pages + "\n" +
                "currentPage: " + currentPage + "\n" +
                "open: " + open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public void openBook() {
        this.setOpen(true);
    }

    @Override
    public void closeBook() {
        this.setOpen(false);
    }

    @Override
    public void leafThrough(int p) {
        if (!this.isOpen() || this.getPages() < p) {
            this.setCurrentPage(0);
        } else {
            this.setCurrentPage(p);
        }
    }

    @Override
    public void advancePage() {
        if (!this.isOpen() || this.getCurrentPage() == this.getPages()) {
            this.setCurrentPage(0);
        } else {
            this.setCurrentPage(this.getCurrentPage() + 1);
        }
    }

    @Override
    public void backPage() {
        if (!this.isOpen() || this.getCurrentPage() == 0) {
            this.setCurrentPage(0);
        } else {
            setCurrentPage(getCurrentPage() - 1);
        }
    }
}
