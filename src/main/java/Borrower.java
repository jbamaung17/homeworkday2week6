import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;


    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Book> collection) {
        this.collection = collection;
    }

    public int collectionNumber() {
        return this.collection.size();
    }

    public void addBookBorrower(Library library) {
        this.collection.add(library.removeBook());
    }
}
