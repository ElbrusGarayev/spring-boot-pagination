package app;

import app.entity.Person;
import app.repository.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaginationApp {

    public static void main(String[] args) {
        SpringApplication.run(PaginationApp.class, args);
    }

    @Bean
    public CommandLineRunner init(PersonRepo repository) {
        return args -> {
            repository.save(new Person(null, "sazzad", "one", 1995));
            repository.save(new Person(null, "Rony", "one", 1993));
            repository.save(new Person(null, "Naim", "one", 1996));
            repository.save(new Person(null, "Dania", "one", 1995));
            repository.save(new Person(null, "Mamun", "one", 1993));
            repository.save(new Person(null, "Rimi", "one", 1995));
            repository.save(new Person(null, "Habib", "two", 1991));
            repository.save(new Person(null, "Shail", "two", 1999));
            repository.save(new Person(null, "Pranjol", "two", 1998));
            repository.save(new Person(null, "Shohag", "two", 1992));
            repository.save(new Person(null, "Ramjan", "two", 1993));
            repository.save(new Person(null, "Ashik", "two", 1996));
            repository.save(new Person(null, "Kibria", "two", 1995));
            repository.save(new Person(null, "Aurik", "three", 1997));
            repository.save(new Person(null, "Tanvir", "three", 1998));
            repository.save(new Person(null, "Nazmul", "three", 1995));
            repository.save(new Person(null, "Mizan", "three", 1996));
            repository.save(new Person(null, "Anik", "three", 1998));
            repository.save(new Person(null, "Mehedi", "three", 1997));
            repository.save(new Person(null, "Shahadat", "four", 1999));
            repository.save(new Person(null, "Dipak", "four", 1995));
            repository.save(new Person(null, "Mukta", "four", 1997));
            repository.save(new Person(null, "Rabaet", "four", 1997));
            repository.save(new Person(null, "Lopa", "four", 1995));
            repository.save(new Person(null, "Markes", "five", 1997));
            repository.save(new Person(null, "Valentino", "five", 1996));
            repository.save(new Person(null, "Fotik", "five", 1991));
            repository.save(new Person(null, "Lubna", "five", 1992));
        };
    }
}
