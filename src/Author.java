public class Author {
    private String firstName;
    private String lastName;

    // Конструктор класса Author
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттеры для всех полей автора
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}