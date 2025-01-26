package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sys.tem.entity.Person;
import sys.tem.service.GetService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {
    public final GetService service;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city") String city) {
        return service.getPersonsByCity(city);
    }

}
