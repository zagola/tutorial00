package pl.olazagrabska.tutorial00;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import java.lang.Iterable;

public interface ArticlesRepository extends CrudRepository<Element, Character> {
    Optional<Element> findById(Character id);
    Iterable<Element> findAll();
}