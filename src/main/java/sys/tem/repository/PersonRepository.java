package sys.tem.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import sys.tem.entity.Person;
import sys.tem.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, PersonPrimaryKey> {
    public List<Person> getPersonByCityOfLiving(String city);

    public List<Person> getPersonByPersonPrimaryKey_AgeIsLessThan(int age, Sort sort);

    public Optional<Person> getPersonByPersonPrimaryKey_NameAndPersonPrimaryKey_Surname(String name, String surname);
}