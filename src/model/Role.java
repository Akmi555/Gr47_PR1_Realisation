package model;

public enum Role {
    READER("Читатель"),
    ADMIN("Администратор"),
    LIBRARIAN("Библиотекарь");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
