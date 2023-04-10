public class Book {
    private String title;
    private Author author;
    private int year;

    // Конструктор класса Book
    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Геттеры для всех полей книги
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Сеттер для поля "Год публикации"
    public void setYear(int year) {
        this.year = year;
    }
}