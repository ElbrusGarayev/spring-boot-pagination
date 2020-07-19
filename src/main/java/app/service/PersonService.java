package app.service;

import app.entity.Person;
import app.repository.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonService {

    private final PersonRepo repo;

    public Page<Person> findAllBy(Optional<String> name, Optional<Integer> page, Optional<String> sortBy){
        Pageable pageable = PageRequest.of(page.orElse(0), 5,
                Sort.Direction.ASC, sortBy.orElse("id"));
        return repo.findAllByNameContainingIgnoreCase(name.orElse("_"),pageable);
    }

    public Page<Person> findAll(Optional<Integer> page){
        Pageable pageable = PageRequest.of(page.orElse(0), 5,
                Sort.Direction.ASC, "id");
        return repo.findAll(pageable);
    }
}
