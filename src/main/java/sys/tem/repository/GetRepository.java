package sys.tem.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import sys.tem.entity.Person;

import java.util.List;

@Repository
public class GetRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private static final String query = "SELECT personPrimaryKey from Person p where p.city_of_living = :city";

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(query)
                .setParameter("city", city)
                .getResultList();
    }
}
