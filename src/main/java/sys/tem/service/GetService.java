package sys.tem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sys.tem.entity.Person;
import sys.tem.repository.GetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetService {
    public final GetRepository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
