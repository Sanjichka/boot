package h4h.example.springdatajpa.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    public Optional<Book> getBookByName(String name) {
        return bookRepository.findByName(name);
    }

    public Book postBook(Book book) {
        //ne mozhe istata kniga vo povekje zapisi
        if(bookRepository.findByName(book.getName()).isPresent()){
            return null;
        }
        else
            return bookRepository.save(book);
    }

    public Optional<Book> getBookByPrice(int price) {
        return bookRepository.findByPrice(price);
    }

    public Book putBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    public String deleteBook(Long id) {
        if(bookRepository.findById(id).isPresent()) {
            bookRepository.deleteById(id);
            return "Deleted :)";
        }
        else {
            return "Did not exist!";
        }
    }

    public List<Book> postBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }
}
