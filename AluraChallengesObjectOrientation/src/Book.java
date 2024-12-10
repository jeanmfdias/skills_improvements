public class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void details() {
        String message = """
                Book name: %s
                Author: %s
                """.formatted(name, author);
        System.out.println(message);
    }
}
