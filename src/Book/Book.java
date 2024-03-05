package Book;


public class Book {
    private String title;
    private String autor;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.autor = author;
        this.pages = pages;
    }
    public String getInfo(){
        return "Title: " + this.title +"\n"+ "Author: " + this.autor +"\n"+ "Pages: "+ this.pages;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAuthor(String author) {
        this.autor = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}