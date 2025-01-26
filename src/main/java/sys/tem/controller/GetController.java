package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sys.tem.entity.Person;
import sys.tem.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class GetController {
    public final PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city") String city) {
        return personRepository.getPersonByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam(value = "age") int age) {
        return personRepository.getPersonByAge(age, Sort.by("personPrimaryKey.age").ascending());
    }

    @GetMapping("/persons/by-nameSurname")
    public Optional<Person> getPersonsByNameAndSurname(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return personRepository.getPersonByNameAndSurname(name, surname);
    }

}
