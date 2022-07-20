package day30_inheritance.homeWorkTasks.bookTask;

public class TestBookObjects {

    public static void main(String[] args) {


        Book book = new Book("Over the Rainbow", "Mystery", "Boban MIlosevic", 50.99);

        EBook ebook = new EBook("Over the Rainbow", "Mystery", "Boban MIlosevic", 50.99, 25, 365);

        AudioBook audioBook= new AudioBook("Over the Rainbow", "Mystery", "Boban MIlosevic", 50.99, 25, "Jonny Dep");

        ebook.getPrice();
        audioBook.getAuthor();
        ebook.getPrice();

        System.out.println(book);
        System.out.println(ebook);
        System.out.println(audioBook);

    }





}
