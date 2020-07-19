package app.repository;

import app.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query("select s from Person s where name like %?1%")
    Page<Person> findAllByNameContainingIgnoreCase(String str, Pageable pageable);

    Page<Person> findAll(Pageable pageable);
}
