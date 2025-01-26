package sys.tem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private String phone_of_number;
    private String city_of_living;
}
