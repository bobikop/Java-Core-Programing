package day30_inheritance.homeWorkTasks.bookTask;

public class EBook extends  Book {

    public int size;
    public int page;

    public EBook(String title, String type, String author, double price, int size, int page) {
        super(title, type, author, price);
        setSize(size);
        setPage(page);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {

        return page;
    }

    public void setPage(int page) {
        if (page <= 0){
            System.out.println("Invalid page number! " + page);
        }
        this.page = page;
    }

    public void readBook(){
        System.out.println("Reading " + "\"" + getTitle() + "\"");
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "size=" + size +
                ", page=" + page +
                '}';
    }
}
/*
2 Create a subclass of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */