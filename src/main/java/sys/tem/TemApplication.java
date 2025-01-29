package sys.tem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sys.tem.entity.Person;
import sys.tem.entity.PersonPrimaryKey;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TemApplication implements CommandLineRunner {
    @PersistenceContext
    public EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(TemApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        List<Person> person = new ArrayList();
//
//        person.add(Person.builder().personPrimaryKey(
//                        PersonPrimaryKey.builder().age(20).name("Саша").surname("Михайлов").build()
//                ).phoneOfNumber("800").cityOfLiving("Москва").build()
//        );
//        person.add(Person.builder().personPrimaryKey(
//                        PersonPrimaryKey.builder().age(25).name("Вика").surname("Михайленко").build()
//                ).phoneOfNumber("800").cityOfLiving("Москва").build()
//        );
//        person.add(Person.builder().personPrimaryKey(
//                        PersonPrimaryKey.builder().age(28).name("Олег").surname("Миха").build()
//                ).phoneOfNumber("800").cityOfLiving("Москва").build()
//        );
//        person.forEach(entityManager::persist);
    }
}
