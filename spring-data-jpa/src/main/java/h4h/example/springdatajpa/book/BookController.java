package h4h.example.springdatajpa.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @GetMapping("/books/names/{name}")
    public Optional<Book> getBookByName(@PathVariable String name) {
        return bookService.getBookByName(name);
    }

    @GetMapping("/books/prices/{price}")
    public Optional<Book> getBookByPrice(@PathVariable int price) {
        return bookService.getBookByPrice(price);
    }


    @PostMapping("/book")
    public Book postBook(@RequestBody Book book){
        return bookService.postBook(book);}

    @PutMapping("/books/{id}")
    public Book postBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.putBook(book);}

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);}

    @PostMapping("/books")
    public List<Book> postBooks(@RequestBody List<Book> books){
        return bookService.postBooks(books);}

}
