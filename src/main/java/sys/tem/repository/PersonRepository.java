package sys.tem.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sys.tem.entity.Person;
import sys.tem.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, PersonPrimaryKey> {
    @Query("select p from Person p where p.cityOfLiving = ?1")
    public List<Person> getPersonByCity(String city);

    @Query("select p from Person p where p.personPrimaryKey.age < ?1")
    public List<Person> getPersonByAge(int age, Sort sort);

    @Query("select p from Person p where p.personPrimaryKey.name = ?1 and p.personPrimaryKey.surname = ?2")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname);
}