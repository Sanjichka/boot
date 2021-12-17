package h4h.example.springdatajpa.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    /*@Override
    Optional<Book> findById(Long id);*/

    @Query("SELECT b FROM Book b WHERE b.id = ?1")
    public  Optional<Book> findById(@Param("id") Long id);

    /*
    Optional<Book> findByName(String name);*/

    @Query("SELECT b FROM Book b WHERE b.name = ?1")
    public  Optional<Book> findByName(String name);

    Optional<Book> findByPrice(int price);


}
