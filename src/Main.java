public class Main {
    public static void main(String[] args) {
        // Создание объектов Автор
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        // Создание объектов Книга
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Вывод информации о книгах
        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getYear());

        System.out.println("Название книги: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getYear());

        // Изменение года публикации одной из книг
        book1.setYear(1870);
        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getYear());
    }
}