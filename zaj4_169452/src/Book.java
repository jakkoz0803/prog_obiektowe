public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages)
    {
        if(title == "")
            this.title = "puste";
        else {
            this.title = title;
        }
        if(author == "")
            this.author = "puste";
        else {
            this.author = author;
        }
        if(numberOfPages < 0)
            this.numberOfPages = 0;
        else {
            this.numberOfPages = numberOfPages;
        }
    }
    public String toString()
    {
        return ("\"Book: ["
                + title
                + "] by ["
                + author
                + "], Pages: ["
                + numberOfPages
                + "].\"");
    }
    public boolean equals(Book other)
    {
        if(this.author.equals(other.author) &&
                this.title.equals(other.title) &&
                this.numberOfPages == other.numberOfPages)
            return true;
        return false;
    }
}
