import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> library;
    private HashMap<String, Integer> bookGenres;
    private int capacity;

    public Library(int capacity){
        this.library = new ArrayList<>();
        this.capacity = capacity;
        this.bookGenres = new HashMap<>();
    }

    public int checkBookStock() {
        return this.library.size();
    }

    public void addBook(Book book){
        if (this.library.size() < this.capacity) {
            this.library.add(book);
            String genre = book.getGenre();
            if (this.bookGenres.get(genre) != null) {
                this.bookGenres.put(genre, this.bookGenres.get(genre) +1);
            } else {
                this.bookGenres.put(genre, 1);
            }
        }
    }

    public Book removeBook() {
        return this.library.remove(0);
    }

    public int checkGenreSize(){
        return this.bookGenres.size();
    }

    public int checkGenreStock(String genre){
        return this.bookGenres.get(genre);
    }
}
