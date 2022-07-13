public class Book {

    private String name;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.name = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public String toString (){
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
